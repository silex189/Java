package com.platzi.profesoresPlatzi.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.platzi.profesoresPlatzi.model.Teacher;
import com.platzi.profesoresPlatzi.service.TeacherService;
import com.platzi.profesoresPlatzi.util.CustomErrorType;

@Controller
@RequestMapping("/v1")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	//GET
	@RequestMapping(value = "/teachers", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Teacher>> getTeachers(@RequestParam(value="name", required=false) String name) {
		
		List<Teacher> teachers = new ArrayList<>();
		
		if (name == null) {
			teachers = teacherService.findAllTeachers();
			
			if (teachers.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
		
		} else {
			Teacher teacher = teacherService.findByName(name);
			if (teacher == null) {
				return new ResponseEntity(HttpStatus.NOT_FOUND);
			}
			
			teachers.add(teacher);
			return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
		}
	}
	
	//FIND BY ID
	@RequestMapping(value = "teachers/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Teacher>  getTeacherById(@PathVariable("id") Long id) {
		
		Teacher teacher = teacherService.findById(id);
		if (teacher == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
			// You may decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
	}
	
	//DELETE
	@RequestMapping(value = "teachers/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public ResponseEntity<?> deleteTeacher(@PathVariable("id") Long id) {
		
		
		Teacher teacher = teacherService.findById(id);
		if (teacher == null) {
			System.out.println("Unable to delete. teacher with id not found. " + id);
			
			return new ResponseEntity(new CustomErrorType("Unable to delete. teacher with id not found."), 
					HttpStatus.NO_CONTENT);
		}
		
		teacherService.deleteTeacherById(id);
		return new ResponseEntity<Teacher>(HttpStatus.OK);
	}

	public static final String TEACHER_UPLOADED_FOLDER = "images/teachers/";
	//CREATE TEACHER IMAGE
	@RequestMapping(value = "/teachers/image", method = RequestMethod.POST, headers = ("content-type=multipart/form-data"))
	public ResponseEntity<byte[]> uploadTeacherImage(@RequestParam("id_teacher") Long idTeacher, 
			@RequestParam("file") MultipartFile multipartFile, 
			UriComponentsBuilder uriComponentsBuilder ) {
		
		if (idTeacher == null) {
			return new ResponseEntity(new CustomErrorType("Please set id_teacher"),HttpStatus.NO_CONTENT);
		}
		
		if (multipartFile.isEmpty()) {
			return new ResponseEntity(new CustomErrorType("Please select a file to uplad"), HttpStatus.NO_CONTENT);
		}
		
		Teacher teacher = teacherService.findById(idTeacher);
		if (teacher == null) {
			return new ResponseEntity(new CustomErrorType("Teacher with id_teacher: " + idTeacher + " not found"), HttpStatus.NOT_FOUND);
		}
		
		if (!teacher.getAvatar().isEmpty() || teacher.getAvatar() != null) {
			String fileName = teacher.getAvatar();
			Path path = Paths.get(fileName);
			File file = path.toFile();
			if (file.exists()) {
				file.delete();
			}
		}
		
		
		try {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd-HH-mm-ss");
			String dateName = dateFormat.format(date);
			
			String fileName = String.valueOf(idTeacher) + "-pictureTeacher-" + dateName + "." + multipartFile.getContentType().split("/")[1];
			teacher.setAvatar(TEACHER_UPLOADED_FOLDER + fileName);
			
			byte[] bytes = multipartFile.getBytes();
			Path path = Paths.get(TEACHER_UPLOADED_FOLDER + fileName);
			Files.write(path, bytes);
			
			teacherService.updateTeacher(teacher);
			return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(new CustomErrorType("Error during upload: " + multipartFile.getOriginalFilename()), HttpStatus.CONFLICT);
		}
	}
}
