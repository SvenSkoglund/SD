package com.skilldistillery.jpavideostore.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="inventory_item")
public class InventoryItem {

	public InventoryItem() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="media_condition")
	private MediaCondition mediaCondition;
	
	@ManyToOne
	@JoinColumn(name="film_id")
	private Film film;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	
	@OneToMany(mappedBy="item")
	private List<Rental> rentals;

	
	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public MediaCondition getMediaCondition() {
		return mediaCondition;
	}

	public void setMediaCondition(MediaCondition mediaCondition) {
		this.mediaCondition = mediaCondition;
	}

	public int getId() {
		return id;
	}



	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}


	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InventoryItem [id=").append(id).append(", mediaCondition=").append(mediaCondition).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((mediaCondition == null) ? 0 : mediaCondition.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventoryItem other = (InventoryItem) obj;
		if (id != other.id)
			return false;
		if (mediaCondition != other.mediaCondition)
			return false;
		return true;
	}
	
	
}
