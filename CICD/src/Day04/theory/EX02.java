package Day04.theory;

public class EX02 {
	public static void main(String[] args) {
		Box<String> box = new Box("10");
		
		// FruitBox 과일: 이름, 당도
		Box<Fruit> fruitBox = new Box<>(new Fruit("키위", 10));
		Fruit a = fruitBox.getValue();
		System.out.println(a.getName() + " / 당도: " + a.getSugar());
		
		// ToyBox 장난감: 이름, 브랜드, 최소사용연령
		Box<Toy> toyBox = new Box<>(new Toy("장난감", "레고", 5));
		Toy b = toyBox.getValue();
		System.out.println(b.getName() + " / 브랜드: " + b.getBrand() + " / 최소 연령: " + b.getMinAge());
	}
}
