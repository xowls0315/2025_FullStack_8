package Day03.supermarket;

public class Orange extends Fruit {
	public Orange(String name, Integer sugar, String color) {
		super(name, sugar, color);
	}
	
	@Override
	void getInfo() {
		System.out.println("이름: " + this.name + ", 당도: " + this.sugar + ", 색상: " + this.color);
	}
}
