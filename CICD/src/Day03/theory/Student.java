package Day03.theory;

// Has - a 관계는 멤버 변수
// Is - a 관계는 상속

public class Student {
	private String name;
	private Integer age;
	private String gender;
	
	public Student(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void study() {
		System.out.println("공부하기");
	}
	
	void introduce() {
		System.out.println("이름: " + this.name + ", 나이: " + this.age + ", 성별: " + this.gender);
	}
}
