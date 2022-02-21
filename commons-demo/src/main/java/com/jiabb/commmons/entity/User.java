package com.jiabb.commmons.entity;

import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
public class User {

	public static String status = "0";

	private String userId;
	private String name;
	private Address address;
	private List<String> friendsNames;
	private Map<String, String> tag;

	public User() {
	}

	public User(String userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public User(String userId, String name, Address address, List<String> friendsNames, Map<String, String> tag) {
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.friendsNames = friendsNames;
		this.tag = tag;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void updateStatus(String status){
		User.status = status;
	}

	public void addNamePrefix(String prefix){
		this.name = prefix + name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getFriendsNames() {
		return friendsNames;
	}

	public void setFriendsNames(List<String> friendsNames) {
		this.friendsNames = friendsNames;
	}

	public Map<String, String> getTag() {
		return tag;
	}

	public void setTag(Map<String, String> tag) {
		this.tag = tag;
	}
}
