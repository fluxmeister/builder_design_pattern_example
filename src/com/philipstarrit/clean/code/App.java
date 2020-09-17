/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.philipstarrit.clean.code;
import com.google.common.collect.ImmutableList;
import com.philipstarrit.clean.code.builder.Name;

/**
 * @author fluxmeister
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Account account = new Account(1, "philip", null, "starritt", 50, "FooBar Road", "", "belfast", "cool@email.com");
		
		Name name = new Name.Builder().firstName("philip")
										.middleNames(ImmutableList.of("peter"))
										.surname("starritt")
										.build();
		
	}

}
