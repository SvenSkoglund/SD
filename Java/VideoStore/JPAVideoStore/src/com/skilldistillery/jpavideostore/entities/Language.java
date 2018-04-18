package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Language() {
		
	}
	
	@Id
	private int id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Language [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

	
	
}