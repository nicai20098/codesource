package com.jiabb.entity;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;

	public static String hobby = "eat";

	transient private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getHobby() {
		return hobby;
	}

	public static void setHobby(String hobby) {
		Student.hobby = hobby;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
