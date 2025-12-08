package Day03.theory;

// 컬렉션 프레임워크[도구모음]
// ArrayList
// Set
// Map
// ...

import java.util.ArrayList;

public class School {
	
	public static void main(String[] args) {
		ArrayList<Student> studentsList = new ArrayList<>();
		
		studentsList.add(new Student("이영철", 26, "남자"));
		studentsList.add(new Student("손정우", 26, "남자"));
		
		for (int i = 0; i < studentsList.toArray().length; i++) {
			studentsList.get(i).introduce();
		}
	}
}
