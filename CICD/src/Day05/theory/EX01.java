package Day05.theory;

import java.util.ArrayList;

public class EX01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.stream().forEach((v) -> {
			System.out.println(v);
		});
		list.stream().filter((v) -> {
			return v > 3;
		});
		
		// Student 클래스 [name, age, address]
		// 스트림 foreach 학생의 주소를 찍어주는 코드
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("정우", 26, "인천시 부평구"));
		studentsList.add(new Student("태진", 25, "부천시 원미구"));
		studentsList.add(new Student("영철", 26, "시흥시 배곧"));
		
		studentsList.stream().forEach((v) -> {
			System.out.println("학생 이름: " + v.getName() + ", 학생 주소: " + v.getAddress());
		});
	}
}
