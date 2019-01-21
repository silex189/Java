package com.platzi.profesoresPlatzi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.profesoresPlatzi.dao.CourseDao;
import com.platzi.profesoresPlatzi.model.Course;

@Service("courseService")
@Transactional
public class CourseServiceImplement implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public void saveCourse(Course course) {
		courseDao.saveCourse(course);
		
	}

	@Override
	public void deleteCourseById(Long idCourse) {
		courseDao.deleteCourseById(idCourse);
		
	}

	@Override
	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
		
	}

	@Override
	public List<Course> findAllCourses() {
		return courseDao.findAllCourses();
	}

	@Override
	public Course findById(Long idCourse) {
		return courseDao.findById(idCourse);
	}

	@Override
	public Course findByName(String name) {
		return courseDao.findByName(name);
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		return courseDao.findByIdTeacher(idTeacher);
	}

}
