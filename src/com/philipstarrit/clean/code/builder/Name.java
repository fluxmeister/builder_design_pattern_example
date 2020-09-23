/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code.builder;

import java.util.List;

/**
 * @author fluxmeister
 *
 */
public class Name {
	
	private String firstName;
	private List<String> middleNames;
	private String surname;

	
	private Name(Builder builder) {
		this.firstName = builder.firstName;
		this.middleNames = builder.middleNames;
		this.surname = builder.surname;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
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


	public static class Builder {
		private String firstName;
		private List<String> middleNames;
		private String surname;
		
		public  Builder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		

		public Builder middleNames(final List<String> middleNames) {
			this.middleNames = middleNames;
			return this;
		}
		
		public Builder surname(final String surname) {
			this.surname = surname;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
		
	}
	
}

