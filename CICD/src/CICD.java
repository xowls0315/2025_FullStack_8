// 1. Hello World 출력
// 2. 변수 사용법: [타입 + 변수명]
// 3. 데이터 타입: [기본형 + 참조형]
// 4. 입력[prompt]
// 5. 타입캐스팅
// 6. 연산자 (js랑 똑같음)
// 7. 클래스 + 상속, 클래스 타입 캐스팅, Object 클래스

public class CICD {
	public static void main(String[] args) {
		// 불리언, 정수(int), 실수(double), 문자(char), 문자열(String)
		// Wrapper 클래스

//		boolean a = false;
//		int b = 5;
//		int b1 = 5;
//		double c = 3.14;
//		char d = 'd';
//		String e = "안녕하세용";
//
//
//		String f = "쿠키";
//		String f1 = "쿠키";
//		String g = new String("쿠키");
//		String g1 = new String("쿠키");
//
//		System.out.println(f == f1); // true
//		System.out.println(g == g1); // false

// 		Student yj = new Student("여지니", 29);
//		Student jw = new Student("정우", 26);
//		yj.studying();
//		jw.studying();
		
//		// 출력
//		System.out.println("출력");
//
//		// 입력
//		Scanner a = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int b = a.nextInt();
//		System.out.println("입력한 숫자는 :" + b);

//		// 두 정수를 입력받고 더한 후, 결과값 나타내는 프로그램 만들기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 정수를 입력하세요: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = num1 + num2;
//
//		System.out.println("두 수의 합은: " + sum);
		
//		String a = "10";
//		String b = "15";
//		Integer c = Integer.parseInt(a);
//		Integer d = Integer.parseInt(b);
//
//		System.out.println(a+b); // 1015
//		System.out.println(c+d); // 25
		
		Bear pooh = new Bear("푸", 40, "캐나다");
		pooh.brathe();
		pooh.drinkCoke();
		
		Dolphin blue = new Dolphin("블루", 15, "대서양");
		blue.brathe();
		blue.dance();
		
	}
}
