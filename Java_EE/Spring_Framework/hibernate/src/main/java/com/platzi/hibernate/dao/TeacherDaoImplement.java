package com.platzi.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoImplement extends PlatziSession implements TeacherDao {

	private PlatziSession platziSession;
	
	public TeacherDaoImplement() {
		platziSession = new PlatziSession();
	}
	
	@Override
	public void saveTeacher(Teacher teacher) {
		platziSession.getSession().persist(teacher);
		platziSession.getSession().getTransaction().commit();
		
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
//		Teacher teacher = (Teacher) platziSession.getSession().find(Teacher.class, idTeacher);
//		platziSession.getSession().delete(teacher);
//		platziSession.getSession().beginTransaction().commit();
		
//		getSession().beginTransaction();
//		Teacher t = getSession().find(Teacher.class, idTeacher);
//		getSession().delete(t);
//		getSession().getTransaction().commit();
		
//		platziSession.getSession().delete(this.findById(idTeacher));
//		platziSession.getSession().getTransaction().commit();
		Session session ;
	    Teacher teacher ;

	    session = platziSession.getSession();
	    teacher = (Teacher)session.load(Teacher.class,idTeacher);
	    session.delete(teacher);

	    //Esto hace que el delete pendiente se realice 
	    session.flush() ;
		
		
		
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		platziSession.getSession().update(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		return platziSession.getSession().load(Teacher.class, idTeacher);
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
