package Day04.theory;

import java.util.ArrayList;

public class EX03 {
	public static void main(String[] args) {
		// abc test = () -> {
		// 	System.out.println("수육 꿀맛?");
		// };
		// test.hello();
		
		// Plus plus = (a, b) -> a + b;
		// System.out.println(plus.add(3, 5));
		// Minus minus = (a, b) -> a - b;
		// System.out.println(minus.subtraction(10, 2));
		// Multiply multiply = (a, b) -> a * b;
		// System.out.println(multiply.multiply(6, 4));
		// Square square = (a) -> a * a;
		// System.out.println(square.square(5));
		
		// // 함수 정의
		// // 과일 클래스, 과일 클래스 -> 총 당도
		// FruitOperation fruitPlus = (a, b) -> a.getSugar() + b.getSugar();
		// System.out.println(fruitPlus.action(new Fruit("사과", 10), new Fruit("바나나", 20)));
		
		// 학생 클래스: name, age
		// 학생리스트[...]
		// 학생리스트를 넣으면 평균연령을 돌려주는 함수 정의하기
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("철수", 20));
		students.add(new Student("영희", 25));
		students.add(new Student("민수", 28));
		students.add(new Student("영철", 26));
		students.add(new Student("정우", 26));
		
		// Operation 인터페이스를 리스트를 받도록 재정의
		StudentOperation avgAge = (list) -> {
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i).getAge();
			}
			return (double) sum / list.size();
		};
		
		System.out.println("평균 나이: " + avgAge.calculate(students));
	}
}
