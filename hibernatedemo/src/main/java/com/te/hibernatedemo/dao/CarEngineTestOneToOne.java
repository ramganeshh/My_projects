package com.te.hibernatedemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.Car;
import com.te.hibernatedemo.dto.Engine;
//			MAPPING
public class CarEngineTestOneToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory Factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager manager = Factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Engine engine = new Engine();
		engine.setEngineName("Turbo");
		
		Car car = new Car();
		car.setCarName("Porsche");
		car.setCarPrice(25000000);
		car.setEngine(engine);
		manager.persist(car);
		
//		CRUD Operations For Mapping On 	ONE TO ONE
		
		transaction.commit();
		Factory.close();
		manager.close();
		
		
	}

}
