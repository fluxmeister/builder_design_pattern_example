/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code.builder;



/**
 * @author fluxmeister
 * We made this class immutable
 * by setting its attributes accessors to final
 */
public class Account {

	private final int id;
	private final String email;
	private final Address address;
	private final Name name;

	
	/* private Constructor */
	private Account(Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.address = builder.address;
		this.name = builder.name;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}
	
	
	
	
	

	public static class Builder {

		private int id;
		private String email;
		private Address address;
		private Name name;

		public Builder id(final int id) {
			this.id = id;
			return this;
		}

		public Builder email(final String email) {
			this.email = email;
			return this;
		}

		public Builder address(final Address address) {
			this.address = address;
			return this;
		}

		public Builder name(final Name name) {
			this.name = name;
			return this;
		}

		public Account build() {
			return new Account(this);
		}

	}

}
