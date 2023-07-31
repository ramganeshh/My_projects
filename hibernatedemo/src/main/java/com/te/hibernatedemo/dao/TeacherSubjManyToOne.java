package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.Subject;
import com.te.hibernatedemo.dto.Teacher;

public class TeacherSubjManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Subject subject1 = new Subject();
		subject1.setSubName("Biology");
		Subject subject2 = new Subject();
		subject2.setSubName("Java");
		Subject subject3 = new Subject();
		subject3.setSubName("Chemistry");
		Subject subject4 = new Subject();
		subject4.setSubName("English");
		
		ArrayList<Subject> list = new ArrayList<>();
		list.add(subject1);
		list.add(subject2);
		list.add(subject3);
		list.add(subject4);
		
		Teacher teacher = new Teacher();
		teacher.setTeacherName("Sruthi");
		teacher.setGender("Female");
		teacher.setList(list);
		
		manager.persist(teacher);
		transaction.commit();
		factory.close();
		manager.close();
		
		
	}

}
