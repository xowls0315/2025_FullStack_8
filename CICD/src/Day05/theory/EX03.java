package Day05.theory;

import java.util.function.Consumer;

public class EX03 {
	public static void main(String[] args) {
		// 	화살표함수에서 더 꿀 버전 -> 크리닝 (호불호 갈림)
		// 메서드 참조는 매개변수 쌩으로 혼자 들어갈때만 가능함!
		Consumer<String> cs = System.out::println;
		Consumer<String> cs1 = (x) -> System.out.println(x + "님 안녕!");
		cs.accept("태진");
		cs1.accept("태진");
	}
}
