package Day04.theory;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class EX04 {
	public static void main(String[] args) {
		// Function<Integer, Integer> get100 = (x) -> x + 100;
		// System.out.println(get100.apply(100));
		//
		// Function<String, String> sayHello = (x) -> x + ", Hello!!";
		// System.out.println(sayHello.apply("태진"));
		//
		// Consumer<String> print = s -> System.out.println(s);
		// print.accept("하이티비");
		
		// BiConsumer
		// A반 학생 리스트, B반 학생 리스트
		// 전체 평균나이를 콘솔로 찍어주는 함수
		
		// A반 학생 리스트
		ArrayList<Student> classA = new ArrayList<>();
		classA.add(new Student("정우", 26));
		classA.add(new Student("영희", 22));
		
		// B반 학생 리스트
		ArrayList<Student> classB = new ArrayList<>();
		classB.add(new Student("율이", 31));
		classB.add(new Student("지수", 23));
		
		// BiConsumer 정의: 두 반의 평균 나이를 출력하는 함수
		BiConsumer<ArrayList<Student>, ArrayList<Student>> printAvgAge =
				(a, b) -> {
					int sum = 0;
					
					for (int i = 0; i < a.size(); i++) {
						sum += a.get(i).getAge();
					}
					
					for (int i = 0; i < b.size(); i++) {
						sum += b.get(i).getAge();
					}
					
					double avg = (double) sum / (a.size() + b.size());
					System.out.println("전체 평균 나이: " + avg);
				};
		
		printAvgAge.accept(classA, classB);
	}
}
