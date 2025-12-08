package Day03.theory;

public class UniStudent extends Student {
	// 전공, 노트북
	// 파트타임
	private Major major;
	private Laptop laptop;
	
	public UniStudent(String name, Integer age, String gender, Major major, Laptop laptop) {
		super(name, age, gender);
		this.major = major;
		this.laptop = laptop;
	}
	
	void parttime() {
		System.out.println("파트타임 알바합니다.");
	}
}
