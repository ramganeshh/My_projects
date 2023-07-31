package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.te.hibernatedemo.dto.*;

public class DeptEmpOneToManyTest {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Employee employee1=new Employee();
		employee1.setEmployeeName("pani");
		Employee employee2=new Employee();
		employee2.setEmployeeName("ram");
		Employee employee3=new Employee();
		employee3.setEmployeeName("bijan");
		ArrayList<Employee>arrayList=new ArrayList<>();
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
		Department department = new Department();
		department.setDeptName("IT");
		department.setListOfemployee(arrayList);
		
		entityManager.persist(department);
		transaction.commit();
		factory.close();
		entityManager.close();
		
		
	}

}
