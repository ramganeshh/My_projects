package com.te.hibernatedemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.te.hibernatedemo.dto.FavMovies;

public class FavMovieTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		FavMovies movie1 = new FavMovies();
		movie1.setMovieName("Arya2");
		movie1.setMovieHero("Allu Arjun");
		
		FavMovies movie2 = new FavMovies();
		movie2.setMovieName("M.Kumaran Son Of Mahalakshmi");
		movie2.setMovieHero("Jayam Ravi");
		
		FavMovies movie3 = new FavMovies();
		movie3.setMovieName("Vel");
		movie3.setMovieHero("Surya");

		FavMovies movie4 = new FavMovies();
		movie4.setMovieName("Krish");
		movie4.setMovieHero("Krithik Roshan");
		
		manager.persist(movie1);
		manager.persist(movie2);
		manager.persist(movie3);
		manager.persist(movie4);
		
		transaction.commit();
		factory.close();
		manager.close();
		

	}


}
