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

	
	public static class Builder {

		private int id;
		private String email;
		private Address address;
		private Name name;

		//builder methods for setting property
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

		//return fully built object
		public Account build() {
			return new Account(this);
		}

	}
	
	
	/* private constructor to enforce object creation through builder */
	private Account(Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.address = builder.address;
		this.name = builder.name;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", name=" + name + "]";
	}
	
	

}
