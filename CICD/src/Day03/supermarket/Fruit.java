package Day03.supermarket;

abstract class Fruit {
	// 이름, 당도, 색상
	String name;
	Integer sugar;
	String color;
	
	public Fruit(String name, Integer sugar, String color) {
		this.name = name;
		this.sugar = sugar;
		this.color = color;
	}
	
	abstract void getInfo();
}
