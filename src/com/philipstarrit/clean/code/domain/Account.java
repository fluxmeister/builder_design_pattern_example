/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code.domain;

import java.util.List;

/**
 * @author fluxmeister
 *
 */
public class Account {

	private int id;
	private String email;
	private String firstname;
	private List<String> middleNames;
	private String surname;
	private int houseNumber;
	private String street;
	private String zipCode;
	private String city;

	public Account(int id, String email, String firstname, List<String> middleNames, String surname, int houseNumber,
			String street, String zipCode, String city) {
		this.id = id;
		this.firstname = firstname;
		this.middleNames = middleNames;
		this.surname = surname;
		this.houseNumber = houseNumber;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the middleNames
	 */
	public List<String> getMiddleNames() {
		return middleNames;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

}
