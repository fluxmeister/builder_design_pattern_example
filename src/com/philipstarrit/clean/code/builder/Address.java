/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code.builder;

/**
 * @author fluxmeister
 *
 */
public class Address {

	private final int houseNumber;
	private final String street;
	private final String zipCode;
	private final String city;
	
	public static class Builder {
		private int houseNumber;
		private String street;
		private String zipCode;
		private String city;

		//builder methods for setting property
		public Builder houseNumber(final int houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}
		public Builder street(final String street) {
			this.street = street;
			return this;
		}
		public Builder zipCode(final String zipCode) {
			this.zipCode = zipCode;
			return this;
		}
		public Builder city(final String city) {
			this.city = city;
			return this;
		}
		
		//return fully built object
		public Address build() {
			return new Address(this);
		}
		
	}

	/* private constructor to enforce object creation through builder */
	private Address(Builder builder) {
		this.houseNumber = builder.houseNumber;
		this.street = builder.street;
		this.zipCode = builder.zipCode;
		this.city = builder.city;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", zipCode=" + zipCode + ", city=" + city
				+ "]";
	}
	
	

//	/**
//	 * @return the houseNumber
//	 */
//	public int getHouseNumber() {
//		return houseNumber;
//	}
//
//	/**
//	 * @return the street
//	 */
//	public String getStreet() {
//		return street;
//	}
//
//	/**
//	 * @return the zipCode
//	 */
//	public String getZipCode() {
//		return zipCode;
//	}
//
//	/**
//	 * @return the city
//	 */
//	public String getCity() {
//		return city;
//	}
//	
	

	

}
