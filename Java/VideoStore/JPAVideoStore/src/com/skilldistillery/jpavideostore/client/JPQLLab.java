package com.skilldistillery.jpavideostore.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Customer;
import com.skilldistillery.jpavideostore.entities.Film;

public class JPQLLab {

	public static void main(String[] args) {

		// Create a program that uses JPQL to retrieve all Customers in the database
		// whose id is between 100 and 110. Output their first name, last name, and
		// email. (Hint: You can use the BETWEEN reserved word in JPQL just like SQL.)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query = "select s from Customer s where s.id >= 100 and s.id <= 110";
		List<Customer> emps = em.createQuery(query, Customer.class).getResultList();
		for (Customer s : emps) {
			System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail());
		}

		// Modify your previous solution, use a parameter to set both the minimum and
		// maximum ids instead of hard-coding them into the query String.
		String query2 = "select s from Customer s where s.id >= :idMin and s.id <= :idMax";
		List<Customer> emps2 = em.createQuery(query2, Customer.class).setParameter("idMin", 100)
				.setParameter("idMax", 110).getResultList();
		for (Customer s : emps2) {
			System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail());
		}
		//
		// Refactor your program into a method in the JPQLLab class named
		// getRangeOfCustomers.
		//
		// the method should take two arguments (minId, maxId), both ints
		//
		// return the correct list of Customers given these inputs
		//
		// Create a new class in the test src folder named JPQLTest
		//
		// Write a test to ensure that getRangeOfCustomers retrieves Customer objects
		// within the correct range

	}

	public List<Customer> getRangeOfCustomers(int minId, int maxId) {
		List<Customer> custs = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		String query2 = "select s from Customer s where s.id >= :idMin and s.id <= :idMax";
		custs = em.createQuery(query2, Customer.class).setParameter("idMin", minId).setParameter("idMax", maxId)
				.getResultList();

		return custs;

	}

	public String getCustomerEmailByName(String fName, String lName) {
		List<Customer> cust = new ArrayList<>();
		String email = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		String query2 = "select s from Customer s where s.firstName = :fName and s.lastName = :lName";
		cust = em.createQuery(query2, Customer.class).setParameter("fName", fName).setParameter("lName", lName)
				.getResultList();
		try {
			if (cust.get(0).getEmail() == null || cust.get(0).getEmail() == "") {
				return email;
			} else {
				email = cust.get(0).getEmail();
			}
		} catch (IndexOutOfBoundsException e) {
			return email;
		}
		return email;
	}

	// Write a method in the JPQLLab class named getFilmByTitle.
	// the method takes one String as an argument (filmTitle)
	// return either a single Film object...or null
	// write a test to ensure that a Film can be retrieved.
	public Film getFilmByTitle(String title) {
		Film film = null;
		List<Film> films = new ArrayList<>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query2 = "select f from Film f where f.title = :title";
		try {
			film = em.createQuery(query2, Film.class).setParameter("title", title).getResultList().get(0);
		} catch (IndexOutOfBoundsException e) {
			film = null;
		}

		return film;
	}
//	Write a method in the JPQLLab class named getFilmsTitlesByReleaseYear.
//	the method takes one int as an argument (year)
//	return the correct list of film titles (List<String>).
//	write a test to ensure that the correct Film objects were retrieved.
	public List<String> getFilmTitlesByReleaseYear(int releaseYear) {
		List<String> titles = new ArrayList<>();
		List<Film> films = new ArrayList<>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query2 = "select f from Film f where f.releaseYear = :releaseYear";
		films = em.createQuery(query2, Film.class).setParameter("releaseYear", releaseYear).getResultList();
		for (Film f : films) {
			titles.add(f.getTitle());
		}
		try {
			titles.get(0);
		}catch(IndexOutOfBoundsException e) {
			titles = null;
		}
		return titles;
	}

}
