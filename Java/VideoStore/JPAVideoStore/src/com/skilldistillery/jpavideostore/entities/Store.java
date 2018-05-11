package com.skilldistillery.jpavideostore.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Store {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Store() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;

	@OneToMany(mappedBy ="store")
	private List<Customer> customers;
	
	@OneToMany(mappedBy="store")
	private List<Staff> staff;
	
	@OneToOne
	@JoinColumn(name="manager_id")
	private Staff manager;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="inventory_item", joinColumns=@JoinColumn(name="store_id"),inverseJoinColumns=@JoinColumn(name="film_id"))
	private List<Film> films;
	
	@OneToMany(mappedBy="store")
	private List<InventoryItem> items;
	
	
	public List<InventoryItem> getItems() {
		return items;
	}

	public void setItems(List<InventoryItem> items) {
		this.items = items;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public Staff getManager() {
		return manager;
	}

	public void setManager(Staff manager) {
		this.manager = manager;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Store [id=").append(id).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
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
		Store other = (Store) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public void addCustomer(Customer customer) {
		if (customers == null) {
			customers = new ArrayList<Customer>();
		}
		if (!customers.contains(customer)) {
			customers.add(customer);
			if (customer.getAddress() != null) {
				customer.getStore().getCustomers().remove(customer);
			}
			customer.setStore(this);
		}
	}

	public void removeCustomer(Customer customer) {
		customer.setStore(null);
		if (customers != null) {
			customers.remove(customer);
		}
	}
	
	public void addStaff(Staff staff) {
		if (this.staff == null) {
			this.staff = new ArrayList<Staff>();
		}
		if (!this.staff.contains(staff)) {
			this.staff.add(staff);
			if (staff.getStore() != null) {
				staff.getStore().getStaff().remove(staff);
			}
			staff.setStore(this);
		}
	}

	public void removeStaff(Staff staff) {
		staff.setStore(null);
		if (this.staff != null) {
			this.staff.remove(staff);
		}
		
	}
	public void addFilm(Film film) {
		if (films == null) {
			films = new ArrayList<>();
		}
		if(!films.contains(film)) {
			films.add(film);
			film.addStore(this);
		}
	}
	public void removeFilm(Film film) {
		if(films != null && films.contains(film)) {
			films.remove(film);
			film.removeStore(this);
		}
	}
	
}
