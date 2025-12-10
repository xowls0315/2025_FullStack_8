package com.example.test;

public class Student {
	private String name;
	private Integer age;
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	String change() {
		return this.name + " " + this.age;
	}
}
