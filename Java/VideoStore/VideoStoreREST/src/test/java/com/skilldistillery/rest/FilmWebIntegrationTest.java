package com.skilldistillery.rest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skilldistillery.jpavideostore.entities.Film;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class FilmWebIntegrationTest {

	@Test
	public void testListAllFilms() throws JsonParseException, JsonMappingException, IOException {
		TestRestTemplate restTest = new TestRestTemplate();
		ResponseEntity<String> response = restTest.getForEntity("http://localhost:8080/api/films", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		ObjectMapper mapper = new ObjectMapper();
		JsonNode responseJson = mapper.readTree(response.getBody());
		List<Film> films = mapper.readValue(response.getBody(),
				mapper.getTypeFactory().constructCollectionType(List.class, Film.class));
		assertThat(films.get(1).getTitle(), is("ACE GOLDFINGER"));

	}

	@Test
	public void testShowFilm() throws JsonParseException, JsonMappingException, IOException {
		TestRestTemplate restTest = new TestRestTemplate();
		ResponseEntity<String> response = restTest.getForEntity("http://localhost:8080/api/films/2", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		ObjectMapper mapper = new ObjectMapper();
		Film film = mapper.readValue(response.getBody(), mapper.getTypeFactory().constructType(Film.class));
		assertThat(film.getTitle(), is("ACE GOLDFINGER"));
	}

}
