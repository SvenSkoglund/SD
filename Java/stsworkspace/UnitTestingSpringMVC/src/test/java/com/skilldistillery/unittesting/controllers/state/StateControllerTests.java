package com.skilldistillery.unittesting.controllers.state;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.unittesting.data.State;
import com.skilldistillery.unittesting.data.StateDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "StateControllerTests-context.xml" })
@WebAppConfiguration
public class StateControllerTests {
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private StateDAO stateDao;

	@Autowired
	private MockStateDAO dao;

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@After
	public void tearDown() {
		// Reset to origin list of states
		dao.reset();
	}

	// TODO: Complete the test to check that "WEB-INF/result.jsp" is the result
	// of modelAndView.getViewName();
	@Test
	public void test_GET_GetStateDO_with_name_param_sets_view_WEBINF_resultJSP() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("name", "Colorado"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView modelAndView = result.getModelAndView();
			assertEquals("WEB-INF/result.jsp", modelAndView.getViewName());
			// Complete the test

			// Same test with Hamcrest matchers.
			assertThat(modelAndView, hasProperty("viewName", is("WEB-INF/result.jsp")));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	@Test
	public void test_GET_GetStateDO_with_name_param_adds_state_to_model() {
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("name", "Colorado"))
					.andExpect(status().isOk()).andReturn();
			ModelAndView modelAndView = result.getModelAndView();
			// Use Hamcrest matchers
			ModelMap map = modelAndView.getModelMap();
			State st = (State) map.get("state");
			assertThat(st,
					allOf(hasProperty("name", is("Colorado")), hasProperty("abbreviation", is("CO")),
							hasProperty("capital", is("Denver")), hasProperty("latitude", is("39.74001")),
							hasProperty("longitude", is("-104.992259")), hasProperty("capitalPopulation", is(600158))));

			// without hamcrest matchers
			assertEquals("Colorado", st.getName());
			assertEquals("CO", st.getAbbreviation());
			assertEquals("Denver", st.getCapital());
			assertEquals("39.74001", st.getLatitude());
			assertEquals("-104.992259", st.getLongitude());
			assertEquals(600158, st.getCapitalPopulation());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	// TODO: add a test for GET with the "abbr" parameter and value "MI"
	// sets the view WEB-INF/result.jsp
	@Test
	public void test_GET_GetStateDO_with_abbr_param_sets_view_WEBINF_resultJSP() {
		// states.add(new State("MI", "Michigan", "Lansing", "42.73194", "-84.552249",
		// 114297));
		try {
			MvcResult result = mockMvc.perform(get("/GetStateData.do").param("abbr", "MI")).andExpect(status().isOk())
					.andReturn();
			ModelAndView modelAndView = result.getModelAndView();
			// Use Hamcrest matchers
			ModelMap map = modelAndView.getModelMap();
			State st = (State) map.get("state");
			assertThat(st,
					allOf(hasProperty("name", is("Michigan")), hasProperty("abbreviation", is("MI")),
							hasProperty("capital", is("Lansing")), hasProperty("latitude", is("42.73194")),
							hasProperty("longitude", is("-84.552249")), hasProperty("capitalPopulation", is(114297))));

			// without hamcrest matchers
			assertEquals("Michigan", st.getName());
			assertEquals("MI", st.getAbbreviation());
			assertEquals("Lansing", st.getCapital());
			assertEquals("42.73194", st.getLatitude());
			assertEquals("-84.552249", st.getLongitude());
			assertEquals(114297, st.getCapitalPopulation());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

	// TODO: add a test for GET with the "abbr" parameter and value "MI"
	// adds the State to the model.
	// Use Hamcrest matchers for testing the "state" in the model.
	//
	// See InMemoryStateDAO for the expected values.

	// TODO: Complete the test for POSTing a new State object
	// * @Autowire the StateDAO as a field in this class, StateControllerTests
	// * Perform a post() to "NewState.do" with all required State parameters
	// * Return a MvcResult object and test that the view is WEB-INF/result.jsp
	// * Query the autowired DAO for the newly added State and check its fields
	// @Test
	// public void test_POST_sets_WEBINFresultJSP_as_view_and_adds_State_to_dao() {
	// try {
	// MvcResult result = mockMvc.perform(post("/NewState.do").param("name", "Puerto
	// Rico").param("abbreviation", "PR").param("capital", "San
	// Juan").param("latitude", "18.4655").param("longitude",
	// "66.1057").param("capitalPopulation", "395326")).andExpect(status().isOk())
	// .andReturn();
	// ModelAndView modelAndView = result.getModelAndView();
	// ModelMap map = modelAndView.getModelMap();
	//
	// assertEquals("WEB-INF/result.jsp", modelAndView.getViewName());
	//
	// assertThat(stateDao.getStateByAbbreviation("PR"),
	// allOf(hasProperty("name", is("Puerto Rico")), hasProperty("abbreviation",
	// is("PR")),
	// hasProperty("capital", is("San Juan")), hasProperty("latitude",
	// is("18.4655")),
	// hasProperty("longitude", is("66.1057")), hasProperty("capitalPopulation",
	// is(395326))));
	//
	// // without hamcrest matchers
	// assertEquals("Puerto Rico", stateDao.getStateByAbbreviation("PR").getName());
	// assertEquals("PR", stateDao.getStateByAbbreviation("PR").getAbbreviation());
	// assertEquals("San Juan", stateDao.getStateByAbbreviation("PR").getCapital());
	// assertEquals("18.4655", stateDao.getStateByAbbreviation("PR").getLatitude());
	// assertEquals("66.1057",
	// stateDao.getStateByAbbreviation("PR").getLongitude());
	// assertEquals(395326,
	// stateDao.getStateByAbbreviation("PR").getCapitalPopulation());
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// fail(e.toString());
	// }
	// }
	@Test
	public void test_POST_sets_redirect_stateAddedDO_as_view_and_adds_State_to_flashAttributes() {
		try {
			MvcResult result = mockMvc
					.perform(post("/NewState.do").param("name", "Puerto Rico").param("abbreviation", "PR")
							.param("capital", "San Juan").param("latitude", "18.4655").param("longitude", "66.1057")
							.param("capitalPopulation", "395326"))
					.andExpect(status().is3xxRedirection())
					.andExpect(flash().attribute("state", hasProperty("abbreviation", is("PR"))))	.andReturn();
			ModelAndView modelAndView = result.getModelAndView();
			ModelMap map = modelAndView.getModelMap();

			assertEquals("WEB-INF/result.jsp", modelAndView.getViewName());
			State st = (State) map.get("state");
			assertThat(stateDao.getStateByAbbreviation("PR"),
					allOf(hasProperty("name", is("Puerto Rico")), hasProperty("abbreviation", is("PR")),
							hasProperty("capital", is("San Juan")), hasProperty("latitude", is("18.4655")),
							hasProperty("longitude", is("66.1057")), hasProperty("capitalPopulation", is(395326))));

			// without hamcrest matchers
			assertEquals("Puerto Rico", stateDao.getStateByAbbreviation("PR").getName());
			assertEquals("PR", stateDao.getStateByAbbreviation("PR").getAbbreviation());
			assertEquals("San Juan", stateDao.getStateByAbbreviation("PR").getCapital());
			assertEquals("18.4655", stateDao.getStateByAbbreviation("PR").getLatitude());
			assertEquals("66.1057", stateDao.getStateByAbbreviation("PR").getLongitude());
			assertEquals(395326, stateDao.getStateByAbbreviation("PR").getCapitalPopulation());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
}
