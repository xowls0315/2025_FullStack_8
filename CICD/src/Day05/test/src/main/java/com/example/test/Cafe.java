package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// GET /coffee => 커피 리스트
// POST /coffee => 커피 등록
@RestController
public class Cafe {
	ArrayList<Coffee> coffees = new ArrayList<>();
	
	@GetMapping("/coffee")
	public ArrayList<Coffee> getCoffees() {
		return coffees;
	}
	
	@PostMapping("/coffee")
	public Coffee postCoffee(@RequestBody Coffee coffee) {
		coffees.add(coffee);
		return coffee;  // 방금 추가된 객체 그대로 반환
	}
}
