package Day03.supermarket;

public class Apple extends Fruit {
	
	public Apple(String name, Integer sugar, String color) {
		super(name, sugar, color);
	}
	
	@Override
	void getInfo() {
		System.out.println("이름: " + this.name + ", 당도: " + this.sugar + ", 색상: " + this.color);
	}
}
