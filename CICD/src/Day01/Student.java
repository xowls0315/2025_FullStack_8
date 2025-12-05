package Day01;

// 속성[변수] + 함수
// 접근 제어자: private[나만]- protected[부모-자식] - default - public
public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void studying() {
		System.out.println("공부중 ㅎㅎ");
	}
}
