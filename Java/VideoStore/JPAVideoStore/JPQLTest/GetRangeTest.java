import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.client.JPQLLab;
import com.skilldistillery.jpavideostore.entities.Customer;
import com.skilldistillery.jpavideostore.entities.Film;

class GetRangeTest {

	EntityManagerFactory emf;
	EntityManager em;
	JPQLLab jpql;

	@BeforeEach
	void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		jpql = new JPQLLab();
	}

	@AfterEach
	void tearDown() throws Exception {
		jpql = null;
	}

	@Test
	void test_range() {
		List<Customer> custs = jpql.getRangeOfCustomers(50, 150);

		String query = "select s from Customer s where s.id >= 50 and s.id <= 150";
		List<Customer> custs2 = em.createQuery(query, Customer.class).getResultList();

		assertIterableEquals(custs, custs2);
	}

	@Test
	void test_email_search() {
		String email = jpql.getCustomerEmailByName("Mary", "Smithers");
		assertEquals("MARY.SMITH@sdvidcustomer.org", email);
		email = jpql.getCustomerEmailByName("Masdfaary", "Smither2223s");
		assertEquals(null, email);
	}

	@Test
	void test_find_film_by_title() {
		Film film = jpql.getFilmByTitle("ACE GOLDFINGER");
		assertEquals(2, film.getId());
		film = jpql.getFilmByTitle("ACE GasdfasdfasdfasdfOLDFINGER");
		assertEquals(null, film);
	}

	@Test
	void test_find_film_titles_by_release_year() {
		List<String> titles = jpql.getFilmTitlesByReleaseYear(1999);
		assertEquals("ALABAMA DEVIL", titles.get(1));
		titles = jpql.getFilmTitlesByReleaseYear(199999);
		assertEquals(null, titles);

	}

}
