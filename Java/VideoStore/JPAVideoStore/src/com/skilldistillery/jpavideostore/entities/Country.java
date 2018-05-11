package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Country() {
		
	}
	


public Country(String countryCode, String name, String formalName, String capital, String iso3_code, String tld) {
		super();
		this.countryCode = countryCode;
		this.name = name;
		this.formalName = formalName;
		this.capital = capital;
		this.iso3_code = iso3_code;
		this.tld = tld;
	}



//	| country      | varchar(50) | NO   |     | NULL    |       |
//	| formal_name  | varchar(60) | YES  |     | NULL    |       |
//	| sovereignty  | varchar(30) | YES  |     | NULL    |       |
//	| capital      | varchar(80) | YES  |     | NULL    |       |
//	| iso3_code    | char(3)     | YES  |     | NULL    |       |
//	| tld          | char(3)     | YES  |     | NULL  
	
	@Id
	@Column(name="country_code")
	private String countryCode;

	@Column(name="country")
	private String name;

	@Column(name="formal_name")
	private String formalName;
	
	private String capital;

	private String iso3_code;
	
	private String tld;

	public String getName() {
		return name;
	}



	public void setName(String country) {
		this.name = country;
	}



	public String getFormalName() {
		return formalName;
	}



	public void setFormalName(String formalName) {
		this.formalName = formalName;
	}



	public String getCapital() {
		return capital;
	}



	public void setCapital(String capital) {
		this.capital = capital;
	}



	public String getIso3_code() {
		return iso3_code;
	}



	public void setIso3_code(String iso3_code) {
		this.iso3_code = iso3_code;
	}



	public String getTld() {
		return tld;
	}



	public void setTld(String tld) {
		this.tld = tld;
	}



	public String getCountryCode() {
		return countryCode;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [countryCode=").append(countryCode).append(", country=").append(name)
				.append(", formalName=").append(formalName).append(", capital=").append(capital).append(", iso3_code=")
				.append(iso3_code).append(", tld=").append(tld).append("]");
		return builder.toString();
	}

	
}