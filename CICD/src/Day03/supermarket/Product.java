package Day03.supermarket;

public class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	void getInfo() {
		System.out.println("이름: " + this.name + ", 가격: " + this.price);
	}
}
