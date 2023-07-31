package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.Gods;
import com.te.hibernatedemo.dto.Worshipers;

public class GodWorshipersManyToManyTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Gods god1 = new Gods();
		god1.setGodName("Jai Hanuman");
		Gods god2 = new Gods();
		god2.setGodName("Lord Siva");
		Gods god3 = new Gods();
		god3.setGodName("Lord Allah");
		Gods god4 = new Gods();
		god4.setGodName("Lord SreeRam");
		Gods god5 = new Gods();
		god5.setGodName("Supreme Power");
		
		ArrayList<Gods> list = new ArrayList<>();
		list.add(god1);
		list.add(god2);
		list.add(god3);
		list.add(god4);
		list.add(god5);
		
		
		Worshipers worshipers1 = new Worshipers();
		worshipers1.setWorshiperName("Bijan");
		worshipers1.setGods(list);
		Worshipers worshipers2 = new Worshipers();
		worshipers2.setWorshiperName("Ram");
		worshipers2.setGods(list);
		Worshipers worshipers3 = new Worshipers();
		worshipers3.setWorshiperName("Pani");
		worshipers3.setGods(list);
		Worshipers worshipers4 = new Worshipers();
		worshipers4.setWorshiperName("Pavithra");
		worshipers4.setGods(list);
		Worshipers worshipers5 = new Worshipers();
		worshipers5.setWorshiperName("Rajnish");
		worshipers5.setGods(list);
	
		manager.persist(worshipers1);
		manager.persist(worshipers2);
		manager.persist(worshipers3);
		manager.persist(worshipers4);
		manager.persist(worshipers5);
		
		transaction.commit();
		factory.close();
		manager.close();
		
	}

}
