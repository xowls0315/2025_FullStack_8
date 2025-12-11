package com.example.academy;

public class Teacher {
	private Long id;
	private String name;
	private Integer age;
	private String subject;
	
	public Teacher() {}   // ★ @RequestBody 바인딩용 기본 생성자 필수
	
	public Teacher(Long id, String name, Integer age, String subject) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
