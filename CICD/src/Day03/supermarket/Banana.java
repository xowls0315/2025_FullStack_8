package Day03.supermarket;

public class Banana extends Fruit {
	public Banana(String name, Integer sugar, String color) {
		super(name, sugar, color);
	}
	
	@Override
	void getInfo() {
		System.out.println("이름: " + this.name + ", 당도: " + this.sugar + ", 색상: " + this.color);
	}
}
