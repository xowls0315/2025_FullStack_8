package Day01;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void brathe() {
		System.out.println(name + "의 호흡");
	}
}
