package Day03.supermarket;

import java.util.ArrayList;

public class FruitProgram {
	// ArrayList 타입 applebox
	// ArrayList 타입 orangebox
	private ArrayList<Apple> applebox = new ArrayList<>();
	private ArrayList<Orange> orangebox = new ArrayList<>();
	
	// 프로그램 실행 메서드
	public void run() {
		// 과일 추가
		applebox.add(new Apple("사과", 70, "빨간색"));
		applebox.add(new Apple("영천사과", 80, "황금색"));
		orangebox.add(new Orange("오렌지", 60, "주황색"));
		orangebox.add(new Orange("제주도오렌지", 65, "황금색"));
		
		// 출력
		printApples();
		printOranges();
	}
	
	// 사과 박스 출력
	private void printApples() {
		System.out.println("=== 🍎 사과 박스 ===");
		applebox.forEach(v -> v.getInfo());
	}
	
	// 오렌지 박스 출력
	private void printOranges() {
		System.out.println("=== 🍊 오렌지 박스 ===");
		orangebox.forEach(v -> v.getInfo());
	}
}
