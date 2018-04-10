package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.data.president.MockPresidentDAO;
import com.skilldistillery.data.president.President;
import com.skilldistillery.data.president.PresidentDAO;

public class PresidentTest {

	PresidentDAO dao;

	@Before
	public void setUp() throws Exception {
		dao = new MockPresidentDAO();

	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void test_get_presidents_returns_list() {
		List<President> p2 = new ArrayList<President>();
		p2.add(new President(1, "sven", "richard", "Skoglund", 10, "got bored", "always"));
		p2.add(new President(2, "Mark", "Joseph", "Coleman", 1, "drugs", "green"));
		p2.add(new President(3, "John", "Bob", "Jones", 3, "sexual misconduct", "communist"));

		assertEquals(p2, dao.getPresidents());
		assertEquals(p2.get(0), dao.getPresidents().get(0));
		assertEquals(p2.get(1), dao.getPresidents().get(1));
		assertEquals(p2.get(2), dao.getPresidents().get(2));
	}

	@Test
	public void test_get_presidents() {
		// List<President> p2 = new ArrayList<President>();
		President p1 = new President(1, "sven", "richard", "Skoglund", 10, "got bored", "always");
		President p2 = new President(2, "Mark", "Joseph", "Coleman", 1, "drugs", "green");
		President p3 = new President(3, "John", "Bob", "Jones", 3, "sexual misconduct", "communist");

		assertEquals(p1, dao.getPresidentByTermNumber(1));
		assertEquals(p2, dao.getPresidentByTermNumber(2));
		assertEquals(p3, dao.getPresidentByTermNumber(3));
	}

	@Test
	public void test_find_by_party() {
		// List<President> p2 = new ArrayList<President>();
		President p1 = new President(1, "sven", "richard", "Skoglund", 10, "got bored", "always");
		President p2 = new President(2, "Mark", "Joseph", "Coleman", 1, "drugs", "green");
		President p3 = new President(3, "John", "Bob", "Jones", 3, "sexual misconduct", "communist");

		assertEquals(p1, dao.findByParty("always").get(0));
		assertEquals(p2, dao.findByParty("green").get(0));
		assertEquals(p3, dao.findByParty("communist").get(0));
	}

	@Test
	public void test_find_by_LastName() {
	President p1 = new President(1, "sven", "richard", "Skoglund", 10, "got bored", "always");
	President p2 = new President(2, "Mark", "Joseph", "Coleman", 1, "drugs", "green");
	President p3 = new President(3, "John", "Bob", "Jones", 3, "sexual misconduct", "communist");

	assertEquals(p1, dao.findByLastName("Skoglund").get(0));
	assertEquals(p2, dao.findByLastName("Coleman").get(0));
	assertEquals(p3, dao.findByLastName("Jones").get(0));
}

}
