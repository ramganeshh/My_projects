package com.te.hibernatedemo.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


//				ONE TO MANY EXAMPLE
public class CountryStatesDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
//		State state = new State();
//		state.setStateName("Tamil_Nadu");
//		
//		State state1 = new State();
//		state1.setStateName("Andra_Pradesh");
//		
//		State state2 = new State();
//		state2.setStateName("Odisha");
//		
//		State state3 = new State();
//		state3.setStateName("Karnataka");
//		
//		State state4 = new State();
//		state4.setStateName("Bihar");
//		
//		ArrayList<State> list = new ArrayList<>();
//		list.add(state);
//		list.add(state1);
//		list.add(state2);
//		list.add(state3);
//		list.add(state4);
//		
//	
//		Country country = new Country();
//		country.setCountryName("India");
//		country.setStates(list);
		
//		entityManager.persist(country);
		
		
		transaction.commit();
		factory.close();
		entityManager.close();
		
	}

}
