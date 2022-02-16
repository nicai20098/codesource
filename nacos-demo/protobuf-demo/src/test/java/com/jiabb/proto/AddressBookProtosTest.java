package com.jiabb.proto;

import junit.framework.TestCase;

public class AddressBookProtosTest extends TestCase {

	public void testAddressBookProtos(){
		Person build = Person.newBuilder().setId(15).setEmail("email").setName("name").build();
		System.out.println(build.hasId());
	}

}
