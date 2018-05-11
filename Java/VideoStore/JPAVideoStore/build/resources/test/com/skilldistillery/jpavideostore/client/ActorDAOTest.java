package com.skilldistillery.jpavideostore.client;

import com.skilldistillery.jpavideostore.data.ActorDAO;
import com.skilldistillery.jpavideostore.data.ActorDAOImpl;
import com.skilldistillery.jpavideostore.entities.Actor;

public class ActorDAOTest {

	public static void main(String[] args) {
		ActorDAO dao = new ActorDAOImpl();
		// Actor sven = new Actor("Sven", "Skoglund");
		// dao.create(sven);
		//
		//
		// sven.setFirstName("Lil");
		// sven.setLastName("Rich");
		// dao.update(sven.getId(), sven);

		for (int i = 203; i < 230; i++) {
			boolean isDeleted = dao.destroy(i);
			System.out.println(isDeleted);
		}
		// sven = new Actor("Svenasdf", "Skoasdfglund");
		//
		// isDeleted = dao.destroy(sven.getId());
		// System.out.println(isDeleted);
	}

}
