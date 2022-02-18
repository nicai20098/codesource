package com.jiabb.proto;

import com.google.protobuf.InvalidProtocolBufferException;
import junit.framework.TestCase;

public class AddressBookProtosTest extends TestCase {

	public void testAddressBookProtos() throws InvalidProtocolBufferException {
		Person build = Person.newBuilder().setId(15).setEmail("email").setName("name").build();
		System.out.println(build.hasId());

		byte[] bytes = build.toByteArray();


		Person person = Person.parseFrom(bytes);
		System.out.println(bytes);
		System.out.println(person.toString());
	}

}
