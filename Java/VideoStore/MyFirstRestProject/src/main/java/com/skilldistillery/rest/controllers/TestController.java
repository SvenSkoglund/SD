package com.skilldistillery.rest.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.rest.data.Profile;
import com.skilldistillery.rest.data.User;

@RestController
@RequestMapping("api")
public class TestController {

	@RequestMapping(path = "ping", method = RequestMethod.GET)
	public String ping() {
		return "pong";
	}

	@RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}

	@RequestMapping(path = "users", method = RequestMethod.GET)
	public User getUser() {
		User sven = new User("Sven", "svenrskoglund", "svenrskoglund@gmail.com", "password");
		Profile profile = new Profile();
		profile.setName("sven");
		profile.setUser(sven);
		sven.setProfile(profile);
		return sven;
	}
	
	@RequestMapping(path = "profiles", method = RequestMethod.GET)
	public Profile getProfile() {
		User sven = new User("Sven", "svenrskoglund", "svenrskoglund@gmail.com", "password");
		Profile profile = new Profile();
		profile.setName("sven");
		profile.setUser(sven);
		sven.setProfile(profile);
		return profile;
	}
}
