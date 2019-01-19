package com.platzi.profesoresPlatzi.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.platzi.profesoresPlatzi.model.SocialMedia;
import com.platzi.profesoresPlatzi.model.Teacher;
import com.platzi.profesoresPlatzi.model.TeacherSocialMedia;
import com.platzi.profesoresPlatzi.service.SocialMediaService;
import com.platzi.profesoresPlatzi.service.TeacherService;
import com.platzi.profesoresPlatzi.util.CustomErrorType;

@Controller
@RequestMapping("/v1")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private SocialMediaService socialMediaService;
	
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
	@RequestMapping(value = "/teachers/images", method = RequestMethod.POST, headers = ("content-type=multipart/form-data"))
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
	
	
	//GET IMAGE
	@RequestMapping(value="/teachers/{id_teacher}/images", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getTeacherImage(@PathVariable("id_teacher") Long idTeacher) {
		if (idTeacher == null) {
			return new ResponseEntity(new CustomErrorType("Please set id_teacher "), HttpStatus.NO_CONTENT);
		}
		
		Teacher teacher = teacherService.findById(idTeacher);
		if (teacher == null) {
			return new ResponseEntity(new CustomErrorType("Teacher with id_teacher: " + idTeacher + " not found"), HttpStatus.NO_CONTENT);
		}
		
		try {
			
			String fileName = teacher.getAvatar();
			Path path = Paths.get(fileName);
			File file = path.toFile();
			if (!file.exists()) {
				return new ResponseEntity(new CustomErrorType("Image not found"), HttpStatus.CONFLICT);
			}
			
			byte[] image = Files.readAllBytes(path);
			return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
			
		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity(new CustomErrorType("Error to show image"), HttpStatus.CONFLICT);
		}
			
	}
	
	
	
	//DELETE
	@RequestMapping(value="/teachers/{id_teacher}/images", method = RequestMethod.DELETE, headers = "Accept=application/json") 
	public ResponseEntity<?> deleteTeacherImage(@PathVariable("id_teacher") Long idTeacher) {
		
		if (idTeacher == null) {
			return new ResponseEntity(new CustomErrorType("Please set id_teacher "), HttpStatus.NO_CONTENT);
		}
		
		Teacher teacher = teacherService.findById(idTeacher);
		if (teacher == null) {
			return new ResponseEntity(new CustomErrorType("Teacher with id_teacher: " + idTeacher + " not found"), HttpStatus.NO_CONTENT);
		}
		
		if (teacher.getAvatar().isEmpty() || teacher.getAvatar() == null) {
			return new ResponseEntity(new CustomErrorType("This Teacher doesn't have image assigned"), HttpStatus.NO_CONTENT);
		}
		
		String fileName = teacher.getAvatar();
		Path path = Paths.get(fileName);
		File file = path.toFile();
		
		if (file.exists()) {
			file.delete();
		}
		
		teacher.setAvatar("");
		teacherService.updateTeacher(teacher);
		
		return new ResponseEntity<Teacher>(HttpStatus.NO_CONTENT);
		
	}
	
	
	@RequestMapping(value="/teachers/socialMedias", method = RequestMethod.PATCH, headers = "Accept=application/json")
	public ResponseEntity<?> assingTeacherSocialMedia(@RequestBody Teacher teacher, UriComponentsBuilder uriComponentsBuilder) {
	 
		if (teacher.getIdTeacher() == null) {
			return new ResponseEntity(new CustomErrorType("We need almost id_teacher, id_social_Media and nickname"), HttpStatus.NO_CONTENT);
		}
		
		Teacher teacherSaved = teacherService.findById(teacher.getIdTeacher());
		if (teacherSaved == null) {
			return new ResponseEntity(new CustomErrorType("The id_teacher: " + teacher.getIdTeacher() + " not found"), HttpStatus.NO_CONTENT);
		}
		
		if (teacher.getTeacherSocialMedia().size() == 0) {
			return new ResponseEntity(new CustomErrorType("We need almost id_teacher, id_social_media and nickname"), HttpStatus.NO_CONTENT);
		} else {
			Iterator<TeacherSocialMedia> iterator = teacher.getTeacherSocialMedia().iterator();
			while (iterator.hasNext()) {
				TeacherSocialMedia teacherSocialMedia = iterator.next();
				if (teacherSocialMedia.getSocialMedia().getIdSocialMedia() == null || teacherSocialMedia.getNickname() == null) {
					return new ResponseEntity(new CustomErrorType("We need almost id_teacher, id_social_media and nickname"), HttpStatus.NO_CONTENT);
				} else {
					TeacherSocialMedia teacherSocialMediaAux = socialMediaService.findSocialMediaByIdAndName(
							teacherSocialMedia.getSocialMedia().getIdSocialMedia(), 
							teacherSocialMedia.getNickname());
					
					if (teacherSocialMediaAux != null) {
						return new ResponseEntity(new CustomErrorType("The id_social_media " 
						+ teacherSocialMedia.getSocialMedia().getIdSocialMedia() 
						+ " with nickname"+ teacherSocialMedia.getNickname() 
						+ " already exists"), HttpStatus.NO_CONTENT);
					}
					
					
					SocialMedia socialMedia = socialMediaService.findById(teacherSocialMedia.getSocialMedia().getIdSocialMedia());
					if (socialMedia == null) {
						return new ResponseEntity(new CustomErrorType("The id_social_media "
								+ teacherSocialMedia.getSocialMedia().getIdSocialMedia()
								+ " not found"), HttpStatus.NO_CONTENT);
					}
					
					teacherSocialMedia.setSocialMedia(socialMedia);
					teacherSocialMedia.setTeacher(teacherSaved);
					
					if (teacherSocialMediaAux == null) {
						teacherSaved.getTeacherSocialMedia().add(teacherSocialMedia);
					} else {
						LinkedList<TeacherSocialMedia> teacherSocialMedias = new LinkedList<>();
						teacherSocialMedias.addAll(teacherSaved.getTeacherSocialMedia());
						
						for (int i = 0; i < teacherSocialMedias.size(); i++) {
							TeacherSocialMedia teacherSocialMedia2 = teacherSocialMedias.get(i);
							if (teacherSocialMedia.getTeacher().getIdTeacher() == teacherSocialMedia2.getTeacher().getIdTeacher()
									&& teacherSocialMedia.getSocialMedia().getIdSocialMedia() == teacherSocialMedia2.getSocialMedia().getIdSocialMedia()) {
								
								teacherSocialMedia2.setNickname(teacherSocialMedia.getNickname());
								teacherSocialMedias.set(i, teacherSocialMedia2);
						} else {
							teacherSocialMedias.set(i, teacherSocialMedia2);
						}
					}
						
						teacherSaved.getTeacherSocialMedia().clear();
						teacherSaved.getTeacherSocialMedia().addAll(teacherSocialMedias);
						
					}
			
				}
			}
		}
		teacherService.updateTeacher(teacherSaved);
		return new ResponseEntity<Teacher>(teacherSaved, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}
