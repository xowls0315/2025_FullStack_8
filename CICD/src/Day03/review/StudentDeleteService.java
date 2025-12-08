package Day03.review;

import java.util.Scanner;

public class StudentDeleteService {
	public int deleteStudent(Student[] students, int count, Scanner sc) {
		if (count == 0) {
			System.out.println("삭제할 학생이 없습니다.");
			return count;
		}
		
		System.out.print("삭제할 학생의 번호(1~" + count + "): ");
		int delIndex = sc.nextInt() - 1;
		
		if (delIndex < 0 || delIndex >= count) {
			System.out.println("잘못된 번호입니다.");
			return count;
		}
		
		// 앞으로 한 칸씩 당기기
		for (int i = delIndex; i < count - 1; i++) {
			students[i] = students[i + 1];
		}
		
		students[count - 1] = null;
		count--;
		
		System.out.println("학생 삭제 완료!");
		
		return count;
	}
}
