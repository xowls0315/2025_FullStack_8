package Day03.supermarket;

import java.util.ArrayList;
import java.util.HashMap;

public class Main1 {
	public static void main(String[] args) {
		// HashSet<String> test = new HashSet<>();
		// test.add("태진");
		// test.add("하이");
		// test.add("방가티비");
		//
		// // ArrayList [중복 가능, 순서 있음]
		// // HashSet [중복 불가능, 순서 없음]
		// // Iterator: 자료를 하나씩 읽어주는 타입
		// Iterator it = test.iterator();
		// while (it.hasNext()) {
		// 	System.out.println(it.next());
		// }
		
		// HashMap<Integer, String> map = new HashMap();
		// map.put(1, "주휴수당");
		// map.put(2, "연차수당");
		// map.put(3, "야간수당");
		// map.put(4, "휴일수당");
		// map.put(5, "퇴직금");
		// map.put(6, "연장근로수당");
		//
		// System.out.println(map.get(2));
		
		// 1. 사과바구니, 2. 오렌지바구니, 3. 바나나 바구니
		HashMap<Integer, ArrayList<Fruit>> fruitMap = new HashMap<>();
		ArrayList<Fruit> appleBox = new ArrayList<Fruit>();
		ArrayList<Fruit> orangeBox = new ArrayList<Fruit>();
		ArrayList<Fruit> bananaBox = new ArrayList<Fruit>();
		
		appleBox.add(new Apple("풋사과", 10, "초록색"));
		appleBox.add(new Apple("홍사과", 12, "빨간색"));
		fruitMap.put(1, appleBox);
		orangeBox.add(new Orange("천혜향", 10, "주황색"));
		orangeBox.add(new Orange("한라봉", 11, "주황색"));
		fruitMap.put(2, orangeBox);
		bananaBox.add(new Banana("몽키바나나", 5, "노란색"));
		bananaBox.add(new Banana("동킹콩바나나", 7, "노란색"));
		fruitMap.put(3, bananaBox);
		
		fruitMap.get(1).forEach((v) -> v.getInfo());
		fruitMap.get(2).forEach((v) -> v.getInfo());
		fruitMap.get(3).forEach((v) -> v.getInfo());
	}
}
