package com.skilldistillery.unittesting.examples.controllers.album;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import org.springframework.web.context.WebApplicationContext;

import com.skilldistillery.unittesting.data.Album;
import com.skilldistillery.unittesting.data.AlbumDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"AlbumControllerTests-context.xml"})
@WebAppConfiguration
public class AlbumControllerTests {
  @Autowired
  private WebApplicationContext wac;

  private MockMvc mockMvc;

  // Autowire the MockAlbumDAO configured in AlbumControllerTests-context.xml
  @Autowired
  private MockAlbumDAO dao;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @After
  public void tearDown() {
    // Clear list of albums so that tests cannot affect each other
    dao.albums.clear();
  }
  
  @Test
  public void test_POST_addAlbum_adds_album_to_DAO() {
    // POST all parameters for an album, then check the DAO to see that it was added
    try {
      MvcResult result = mockMvc.perform(post("/addAlbum.do")
          .param("id", "1")
          .param("artist", "The Artist")
          .param("title", "The Title"))
          .andExpect(status().isOk())
          .andReturn();
      
      // Look in DAO
      Album a = dao.getAlbumById(1);
      assertThat(a, allOf(
          hasProperty("id", is(1)),
          hasProperty("artist", is("The Artist")),
          hasProperty("title", is("The Title"))
          ));
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
