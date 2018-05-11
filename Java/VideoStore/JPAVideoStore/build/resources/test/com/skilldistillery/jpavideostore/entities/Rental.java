package com.skilldistillery.jpavideostore.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rental {
	public Rental () {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "rental_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rentalDate;

	@Column(name = "return_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date returnDate;

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rental [id=").append(id).append(", rentalDate=").append(rentalDate).append(", returnDate=")
				.append(returnDate).append("]");
		return builder.toString();
	}
	
	
}
