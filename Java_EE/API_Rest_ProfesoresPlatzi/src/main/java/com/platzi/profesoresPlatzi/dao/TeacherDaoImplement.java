package com.platzi.profesoresPlatzi.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.platzi.profesoresPlatzi.model.Teacher;
import com.platzi.profesoresPlatzi.model.TeacherSocialMedia;

@Repository
@Transactional
public class TeacherDaoImplement extends AbstractSession implements TeacherDao {

	
	@Override
	public void saveTeacher(Teacher teacher) {
		getSession().persist(teacher);
		
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		Teacher teacher = findById(idTeacher);
		if (teacher != null) {
			
			Iterator<TeacherSocialMedia> iterator = teacher.getTeacherSocialMedia().iterator();
			
			while(iterator.hasNext()) {
				TeacherSocialMedia teacherSocialMedia = iterator.next();
				iterator.remove();
				getSession().delete(teacherSocialMedia);
			}
			teacher.getTeacherSocialMedia().clear();
			
			
			getSession().delete(teacher);
		}

	}

	@Override
	public void updateTeacher(Teacher teacher) {
		getSession().update(teacher);
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		return (Teacher) getSession().get(Teacher.class, idTeacher);
	}

	@Override
	public Teacher findByName(String name) {
		return (Teacher) getSession().createQuery(
				"from Teacher where name = :name")
				.setParameter("name", name).uniqueResult();
	}
	

}
