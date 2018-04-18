package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Film {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Film() {
		
	}
	
	@Id
	private int id;

	private String title;
	
	private String description;
	
	@Column(name="release_year")
	private int releaseYear;
	
	@Column(name="rental_rate")
	private double rentalRate;
	
	private int length;
	
	@Column(name="replacement_cost")
	private double replacementCost;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=").append(id).append(", title=").append(title).append(", description=")
				.append(description).append(", releaseYear=").append(releaseYear).append(", rentalRate=")
				.append(rentalRate).append(", length=").append(length).append(", replacementCost=")
				.append(replacementCost).append("]");
		return builder.toString();
	}
	
	
	
}

	