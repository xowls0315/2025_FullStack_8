package Day02;

import java.util.Scanner;

// 7. 클래스 + 상속, 클래스 타입 캐스팅, Object 클래스
// 8. 조건문 (if, switch)
// 9. 반복문 (for, while)
public class Main {
	public static void main(String[] args) {
		// Car ray = new Car("레이", 50, 150, 2020, false);
		
		// // 시동 켜보기
		// ray.engine();
		// ray.stop();
		// ray.accelerate();
		// ray.engine();
		// ray.accelerate();
		
		// // Truck 객체 생성
		// Truck t1 = new Truck("봉고 트럭", 40, 0, 2018, false);
		// t1.load(100); // 현재 적재량
		// t1.engine();
		// t1.accelerate();
		// t1.accelerate();
		// t1.stop();
		// t1.load(250);
		
		// // Parttimer 객체 생성
		// Parttimer p1 = new Parttimer("민수", 22, 10030);
		// // 정보 출력
		// p1.printInfo();
		// // 시급 조정
		// p1.adjustHourlyWage(12000);
		// // 조정된 정보 다시 출력
		// p1.printInfo();
		
		// int scores[] = {1, 2, 4, 16, 20, 32, 45};
		// int price[] = new int[7];
		//
		// String menus[] = new String[3];
		// menus[0] = "아메리카노";
		// menus[1] = "라떼";
		// menus[2] = "모카";
		// System.out.println(menus);
		
		// // 자동차 배열 만들어서 3개 넣고 각각 내용 보여주기
		// Car cars[] = new Car[4];
		// cars[0] = new Car("레이", 100, 0, 2023, false);
		// cars[1] = new Car("k3", 200, 0, 2024, false);
		// cars[2] = new Car("캐스퍼", 150, 0, 2025, false);
		// cars[3] = new Truck("푸드트럭", 120, 0, 2020, false);
		//
		// cars[0].status();
		// cars[1].status();
		// cars[2].status();
		
		// String name = "로제";
		// switch (name) {
		// 	case "로제":
		// 		System.out.println("로제 떡볶이");
		// 		break;
		// 	case "마라":
		// 		System.out.println("마라 떡볶이");
		// 		break;
		// 	default:
		// 		System.out.println("없어요.");
		// 		break;
		// }
		
		// Scanner sc = new Scanner(System.in);
		// System.out.print("문자를 입력하세요: ");
		// String message = sc.nextLine();
		// switch (message.trim()) {
		// 	case "퇴직": {
		// 		System.out.println("퇴직금 나옵니다!");
		// 		break;
		// 	}
		// 	case "주휴": {
		// 		System.out.println("주휴수당 나옵니다!");
		// 		break;
		// 	}
		// 	case "연차": {
		// 		System.out.println("연차수당 나옵니다!");
		// 		break;
		// 	}
		// 	default: {
		// 		System.out.println("노무사한테 가십쇼!");
		// 		break;
		// 	}
		// }
		
		// for (int i = 1; i <= 100; i++) {
		// 	if (i % 3 == 0) System.out.println(i + "는 3의 배수 입니다.");
		// 	else if (i % 5 == 0) System.out.println(i + "는 5의 배수 입니다.");
		// 	else System.out.println("토끼");
		// }
		
		// // 구구단
		// // 유저에게 단을 물어보고 나타내기
		// Scanner num = new Scanner(System.in);
		// System.out.print("구구단의 단을 입력하세요: ");
		// int gugudan = num.nextInt();
		// for (int i = 1; i <= 9; i++) {
		// 	System.out.println(gugudan + " x " + i + " = " + (gugudan * i));
		// }
		
		// // 369게임
		// // 1~100까지 찍음
		// // 3,6,9 숫자가 들어가면 "👏" (ex: 36도 똑같이 "👏")
		// for (int i = 1; i <= 100; i++) {
		// 	String num = String.valueOf(i);   // 숫자를 문자열로 변환
		// 	if (num.contains("3") || num.contains("6") || num.contains("9")) {
		// 		System.out.println("👏 (" + i + ")");
		// 	} else {
		// 		System.out.println(i);
		// 	}
		// }
		
		// // 유저에게 번호를 입력받고 (while 문)
		// // 1 => 퇴직금 계산법 알아보기
		// // 2 => 주휴수당 계산법 알아보기
		// // 3 => 연차수당 계산법 알아보기
		// // 4 => 프로그램 종료
		// while (true) {
		// 	Scanner user = new Scanner(System.in);
		// 	System.out.print("번호를 입력하세요: ");
		// 	int num = user.nextInt();
		//
		// 	switch (num) {
		// 		case 1:
		// 			System.out.println("1. 퇴직금 계산법: 평균임금 × 30일 × (근속연수 / 365)");
		// 			break;
		// 		case 2:
		// 			System.out.println("2. 주휴수당 계산법: (주 소정근로시간 ÷ 40시간) × 8시간 × 시급");
		// 			break;
		// 		case 3:
		// 			System.out.println("3. 연차수당 계산법: 1일 통상임금 × 사용하지 않은 연차 개수");
		// 			break;
		// 		case 4:
		// 			System.out.println("4. 프로그램을 종료합니다!");
		// 			return;
		// 		default:
		// 			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		// 			break;
		// 	}
		// }
		
		// // 계산기
		// // 1 => 더하기
		// // 두 숫자 입력, 두 수의 합
		// // 2 => 빼기
		// // 두 숫자 입력, 두 수의 차
		// // 3 => 곱하기
		// // 두 숫자 입력, 두 수의 곱
		// // 4 => 나누기
		// // 두 숫자 입력, 두 수의 나눗셈, 두 수의 나머지
		// // 5 => 프로그램 종료
		// Scanner sc = new Scanner(System.in);
		// while (true) {
		// 	System.out.print("번호를 입력하세요(1~5): ");
		// 	int num = sc.nextInt();
		// 	if (num == 5) {
		// 		System.out.println("프로그램 종료합니다.");
		// 		break;
		// 	}
		//
		// 	// 1~4번은 모두 두 숫자를 입력해야 함 → 공통 코드
		// 	System.out.print("두 정수를 입력: ");
		// 	int a = sc.nextInt();
		// 	int b = sc.nextInt();
		//
		// 	switch (num) {
		// 		case 1:
		// 			System.out.println("두 수의 합: " + (a + b));
		// 			break;
		// 		case 2:
		// 			System.out.println("두 수의 차: " + (a - b));
		// 			break;
		// 		case 3:
		// 			System.out.println("두 수의 곱: " + (a * b));
		// 			break;
		// 		case 4:
		// 			System.out.println("두 수의 나눗셈: " + (a / b) + ", 두 수의 나머지: " + (a % b));
		// 			break;
		// 		default:
		// 			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		// 	}
		// }
		
		// 학생 프로그램
		// 학생: name, age, tuition
		// 1 => 학생 등록[10명까지 가능]
		// 2 => 학생 삭제[]
		// 3 => 학생 전체 조회[]
		// 4 => 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		// 학생을 저장할 배열 (최대 10명)
		Student[] students = new Student[10];
		int count = 0; // 현재 저장된 학생 수
		while (true) {
			System.out.println("=== 학생 등록 프로그램 ===");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 전체 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호를 입력하세요(1~4): ");
			int num = sc.nextInt();
			
			switch (num) {
				case 1: // 학생 등록
					if (count >= 10) {
						System.out.println("학생은 최대 10명까지 등록할 수 있습니다.");
						break;
					}
					
					System.out.print("학생 이름: ");
					String name = sc.next();
					System.out.print("학생 나이: ");
					int age = sc.nextInt();
					System.out.print("학생 수업료: ");
					int tuition = sc.nextInt();
					
					students[count] = new Student(name, age, tuition);
					count++;
					
					System.out.println("학생 등록 완료!");
					break;
				case 2: // 학생 삭제
					if (count == 0) {
						System.out.println("삭제할 학생이 없습니다.");
						break;
					}
					System.out.print("삭제할 학생의 번호(1~" + count + "): ");
					int delIndex = sc.nextInt() - 1;
					
					if (delIndex < 0 || delIndex >= count) {
						System.out.println("잘못된 번호입니다.");
						break;
					}
					// 앞으로 한 칸씩 당기기
					for (int i = delIndex; i < count - 1; i++) {
						students[i] = students[i + 1];
					}
					
					students[count - 1] = null;
					count--;
					
					System.out.println("학생 삭제 완료!");
					break;
				case 3: // 학생 전체 조회
					if (count == 0) {
						System.out.println("등록된 학생이 없습니다.");
						break;
					}
					
					System.out.println("==== 학생 전체 조회 ====");
					for (int i = 0; i < count; i++) {
						System.out.println((i + 1) + "번 학생");
						System.out.println("이름: " + students[i].name);
						System.out.println("나이: " + students[i].age);
						System.out.println("수업료: " + students[i].tuition);
						System.out.println("----------------------");
					}
					break;
				case 4: // 종료
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
}