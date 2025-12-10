package Day05.theory;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EX02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ArrayList<Integer> list1 = list.stream().filter((v) -> v > 3).collect(Collectors.toCollection(ArrayList::new));
	}
}
