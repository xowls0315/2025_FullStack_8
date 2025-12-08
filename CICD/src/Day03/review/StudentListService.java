package Day03.review;

public class StudentListService {
	public void printAllStudents(Student[] students, int count) {
		if (count == 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		
		System.out.println("==== 학생 전체 조회 ====");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번 학생");
			System.out.println("이름: " + students[i].name);
			System.out.println("나이: " + students[i].age);
			System.out.println("수업료: " + students[i].tuition);
			System.out.println("----------------------");
		}
	}
}
