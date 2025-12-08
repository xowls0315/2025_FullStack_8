package Day03.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

// Product 클래스 만들고,
// name, price
// while문으로 1. 상품담기, 2. 상품 전체조회, 3. 프로그램 종료
public class ProductProgram {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Product> cart = new ArrayList<>();
	
	// 전체 프로그램을 실행하는 메서드
	public void run() {
		while (true) {
			System.out.println("=== 슈퍼마켓 프로그램 ===");
			System.out.println("1. 상품 담기");
			System.out.println("2. 상품 전체 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("번호를 입력하세요(1~3): ");
			
			int num = sc.nextInt();
			
			switch (num) {
				case 1: // 상품 담기
					addProduct();
					break;
				
				case 2: // 상품 전체 조회
					showAllProducts();
					break;
				
				case 3: // 종료
					System.out.println("프로그램 종료합니다.");
					sc.close();
					return;
				
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
					break;
			}
			
			System.out.println();
		}
	}
	
	// 상품 담기 기능
	private void addProduct() {
		sc.nextLine();
		
		System.out.print("상품 이름 입력: ");
		String name = sc.nextLine();
		
		System.out.print("상품 가격 입력: ");
		int price = sc.nextInt();
		
		cart.add(new Product(name, price));
		
		System.out.println("상품 담기 완료!");
	}
	
	// 상품 전체 조회 기능
	private void showAllProducts() {
		if (cart.isEmpty()) {
			System.out.println("담긴 상품이 없습니다.");
			return;
		}
		
		System.out.println("=== 장바구니 상품 목록 ===");
		cart.forEach((v) -> v.getInfo());
		
		Integer sum = cart.stream().map((v) -> v.getPrice()).reduce(0, Integer::sum);
		System.out.println("총 가격: " + sum);
	}
}
