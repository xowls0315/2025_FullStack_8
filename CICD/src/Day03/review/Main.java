package Day03.review;

import java.util.Scanner;

/*
 * 1. 변수 [입출력]
 * 2. 데이터 타입
 * 3. 타입캐스팅
 * 4. 연산자, 조건문, 반복문
 * 5. 클래스, 상속
 * */
public class Main {
	public static void main(String[] args) {
		// 학생 프로그램
		// 학생: name, age, tuition
		// 1 => 학생 등록[10명까지 가능]
		// 2 => 학생 삭제[]
		// 3 => 학생 전체 조회[]
		// 4 => 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		// 학생을 저장할 배열 (최대 10명)
		Student[] students = new Student[10];
		int count = 0; // 현재 저장된 학생 수
		
		// 기능 담당 객체들
		StudentProgram program = new StudentProgram();
		StudentRegisterService registerService = new StudentRegisterService();
		StudentDeleteService deleteService = new StudentDeleteService();
		StudentListService listService = new StudentListService();
		
		while (true) {
			int num = program.showMenuAndGetChoice(sc);
			
			switch (num) {
				case 1: // 학생 등록
					count = registerService.registerStudent(students, count, sc);
					break;
				case 2: // 학생 삭제
					count = deleteService.deleteStudent(students, count, sc);
					break;
				case 3: // 학생 전체 조회
					listService.printAllStudents(students, count);
					break;
				case 4: // 종료
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
			
			System.out.println();
		}
	}
}
