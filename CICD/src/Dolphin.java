public class Dolphin extends Animal {
	private String location;
	
	public Dolphin(String name, int age, String location) {
		super(name, age);
		this.location = location;
	}
	
	public void dance() {
		System.out.println("춤 추는중~!");
	}
}
