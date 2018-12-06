package com.platzi.hibernate;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoImplement;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
//        Teacher teacher = new Teacher("Anahi Salgado", "Avatar");
//        session.beginTransaction();
//        session.save(teacher);
//        session.getTransaction().commit();
        
//        Course course = new Course("Java Avanzado", "Tema 1", "Rest API");
//        session.beginTransaction();
//        session.save(course);
//        session.getTransaction().commit();
    	
//    	Teacher teacher = new Teacher("Christian", "Avatar");
//    	TeacherDaoImplement teacherDaoImplement = new TeacherDaoImplement();
//    	teacherDaoImplement.saveTeacher(teacher);
//    	
//    	List<Teacher> teachers = teacherDaoImplement.findAllTeachers();
//    	
//    	for (Teacher t : teachers) {
//    		System.out.println("Nombre: " + t.getName());
    	
//    	}
    	
    	
    	TeacherDaoImplement teacherDaoImplement = new TeacherDaoImplement();
    	
    	Teacher teacher = teacherDaoImplement.findById((long) 3);
    	teacher.setName("Raul Cimas");
    	teacherDaoImplement.updateTeacher(teacher);
    	teacherDaoImplement.deleteTeacherById((long) 3); 
    	
//    	TeacherDaoImplement teacherDaoImplement = new TeacherDaoImplement();
//    	teacherDaoImplement.deleteTeacherById((long) 3); 
//    	
    }
}
