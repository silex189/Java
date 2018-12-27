package com.platzi.profesoresPlatzi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.profesoresPlatzi.dao.TeacherDao;
import com.platzi.profesoresPlatzi.model.Teacher;

@Service("teacherService")
@Transactional
public class TeacherServiceImplement implements TeacherService{

	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public void saveTeacher(Teacher teacher) {
		teacherDao.saveTeacher(teacher);
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		teacherDao.deleteTeacherById(idTeacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);
		
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return teacherDao.findAllTeachers();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		return teacherDao.findById(idTeacher);
	}

	@Override
	public Teacher findByName(String name) {
		return teacherDao.findByName(name);
	}

}
