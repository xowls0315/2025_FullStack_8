package Day04.review;

import java.util.ArrayList;
import java.util.Scanner;

// 카페 키오스크
// 0. 커피 등록하기[아메리카노 1500, 라떼 2000, 율피 3500]
// 1. 커피 주문하기
// 2. 장바구니 조회하기
// 3. 커피 정산하기[~얼마 입니다, 장바구니 리셋됨]
public class CafeProgram {
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList<Coffee> menu = new ArrayList<>();
	private ArrayList<Coffee> cart = new ArrayList<>();
	
	// 생성자에서 기본 커피 등록
	public CafeProgram() {
		menu.add(new Coffee("아메리카노", 1500));
		menu.add(new Coffee("라떼", 2000));
		menu.add(new Coffee("율피", 3500));
	}
	
	// 프로그램 실행
	public void run() {
		while (true) {
			System.out.println("=== 카페 키오스크 ===");
			System.out.println("0. 커피 메뉴 보기");
			System.out.println("1. 커피 주문하기");
			System.out.println("2. 장바구니 조회하기");
			System.out.println("3. 커피 정산하기");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호를 입력하세요: ");
			
			int num = sc.nextInt();
			
			switch (num) {
				case 0:
					showMenu();
					break;
				case 1:
					orderCoffee();
					break;
				case 2:
					showCart();
					break;
				case 3:
					checkout();
					break;
				case 4:
					System.out.println("프로그램 종료!");
					sc.close();
					return;
				default:
					System.out.println("잘못된 번호입니다.");
			}
			
			System.out.println();
		}
	}
	
	// 0. 메뉴 조회
	private void showMenu() {
		System.out.println("=== 커피 메뉴 ===");
		menu.forEach(m -> System.out.println((menu.indexOf(m) + 1) + ". " + m.name + " - " + m.price + "원"));
	}
	
	// 1. 주문하기
	private void orderCoffee() {
		System.out.println("어떤 커피를 주문하시겠습니까?");
		showMenu();
		
		System.out.print("번호 선택: ");
		int choice = sc.nextInt();
		
		if (choice < 1 || choice > menu.size()) {
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		Coffee selected = menu.get(choice - 1);
		cart.add(selected);
		System.out.println(selected.name + " 장바구니에 추가 완료!");
	}
	
	// 2. 장바구니 조회
	private void showCart() {
		if (cart.isEmpty()) {
			System.out.println("장바구니가 비었습니다.");
			return;
		}
		
		System.out.println("=== 장바구니 ===");
		
		// forEach() 사용하여 출력
		cart.forEach(c -> System.out.println(c.name + " - " + c.price + "원"));
		
		int sum = cart.stream().mapToInt(c -> c.price).sum();
		System.out.println("총 금액: " + sum + "원");
	}
	
	// 3. 정산하기
	private void checkout() {
		if (cart.isEmpty()) {
			System.out.println("장바구니가 비어 있어 정산할 수 없습니다.");
			return;
		}
		
		int total = cart.stream().mapToInt(c -> c.price).sum();
		
		System.out.println("총 " + total + "원 입니다. 결제 완료!");
		
		cart.clear();
		System.out.println("장바구니가 초기화되었습니다.");
	}
}
