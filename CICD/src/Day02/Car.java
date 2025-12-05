package Day02;

// Car 클래스 (name, fuel, speed, year, isEngineOn) + engine() + accelerate() + stop()
public class Car {
	String name;
	int fuel;
	int speed;
	int year;
	boolean isEngineOn;
	
	public Car(String name, int fuel, int speed, int year, boolean isEngineOn) {
		this.name = name;
		this.fuel = fuel;
		this.speed = speed;
		this.year = year;
		this.isEngineOn = isEngineOn;
	}
	
	void status() {
		System.out.println("차량 이름: " + this.name);
		System.out.println("연료량: " + this.fuel);
		System.out.println("속도: " + this.speed);
		System.out.println("연식: " + this.year);
		System.out.println("시동 상태: " + this.isEngineOn);
	}
	
	void engine() {
		this.isEngineOn = !this.isEngineOn;
		String status = this.isEngineOn ? "시동 켜짐" : "시동 꺼짐";
		System.out.println(status);
	}
	
	// accelerate 함수: 엔진이 켜져있으면 -> {출발!, 스피드 10 오름, 연료는 -1}, 안켜져있으면 -> 시동 먼저 키세요!
	// stop 함수: 스피드를 0으로 만들기
	
	void accelerate() {
		if (this.isEngineOn) {
			if (this.fuel > 0) {
				System.out.println("출발! 현재 속도 +10, 연료 -1");
				this.speed += 10;
				this.fuel -= 1;
				System.out.println("스피드: " + this.speed + ", 연료: " + this.fuel);
			} else {
				System.out.println("연료가 0입니다!!");
			}
		} else {
			System.out.println("시동 먼저 키세요!");
		}
	}
	
	void stop() {
		this.speed = 0;
		System.out.println("현재 속도는 " + this.speed + "입니다.");
	}
}
