package Day03.review;

import java.util.Scanner;

public class StudentProgram {
	public int showMenuAndGetChoice(Scanner sc) {
		System.out.println("=== 학생 등록 프로그램 ===");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 전체 조회");
		System.out.println("4. 프로그램 종료");
		System.out.print("번호를 입력하세요(1~4): ");
		
		int num = sc.nextInt();
		return num;
	}
}
