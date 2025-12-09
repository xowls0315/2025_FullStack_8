package Day04.theory;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// int a = sc.nextInt();
			// System.out.println(a);
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("수학적 오류");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
