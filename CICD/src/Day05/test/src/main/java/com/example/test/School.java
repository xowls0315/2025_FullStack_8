package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class School {
	// 학생 [name, age]
	// "이영철 22", "손정우 23", ...
	ArrayList<Student> list = new ArrayList<>();
	
	@GetMapping("/students")
	String[] getStudents() {
		return list.stream().map((v) -> v.change()).toArray(String[]::new);
	}
	
	@PostMapping("/students")
	String postStudents(@RequestBody Student student) {
		list.add(student);
		return "생성 되었습니다.";
	}
	
	// CRUD
	// GET, POST, PUT, DELETE
}
