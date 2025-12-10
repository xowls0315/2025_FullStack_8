package com.example.test;

// Coffee 클래스: name, price, shot
// GET /coffees => 커피 리스트
// POST /coffee => 커피 등록
public class Coffee {
	private String name;
	private Integer price;
	private Integer shot;
	
	// 기본 생성자 (JSON 바인딩용)
	public Coffee() {
	}
	
	public Coffee(String name, Integer price, Integer shot) {
		this.name = name;
		this.price = price;
		this.shot = shot;
	}
	
	// getters (JSON 직렬화용)
	public String getName() {
		return name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public Integer getShot() {
		return shot;
	}
	
	public String info() {
		return "이름: " + this.name + ", 가격: " + this.price + ", 샷갯수: " + this.shot;
	}
}
