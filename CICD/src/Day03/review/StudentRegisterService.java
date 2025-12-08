package Day03.review;

import java.util.Scanner;

public class StudentRegisterService {
	public int registerStudent(Student[] students, int count, Scanner sc) {
		if (count >= students.length) {
			System.out.println("학생은 최대 " + students.length + "명까지 등록할 수 있습니다.");
			return count;
		}
		
		System.out.print("학생 이름: ");
		String name = sc.next();
		
		System.out.print("학생 나이: ");
		int age = sc.nextInt();
		
		System.out.print("학생 수업료: ");
		int tuition = sc.nextInt();
		
		students[count] = new Student(name, age, tuition);
		count++;
		
		System.out.println("학생 등록 완료!");
		
		return count; // 변경된 학생 수를 반환
	}
}
