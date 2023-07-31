package com.te.hibernatedemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.Student;

public class StudentDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		
		Student student = new Student();
		student.setAim("PlayGod");
		student.setDegree("B.E.");
		student.setDept("CSE");
		//student.setId(007);
		student.setName("Bijaanu");
		createEntityManager.persist(student);
		
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();
		
		
	}

}
