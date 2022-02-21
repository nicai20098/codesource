package com.jiabb.commmons.entity;

import lombok.ToString;

@ToString(callSuper = true)
public class Student extends User{

	private String studentId;

	public Student() {
	}

	public Student(String studentId) {
		this.studentId = studentId;
	}

	public Student(String userId, String name, String studentId) {
		super(userId, name);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
