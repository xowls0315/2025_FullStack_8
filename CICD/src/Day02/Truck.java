package Day02;

// Truck 클래스 (name, fuel, speed, year, isEngineOn, loadWeight) + engine() + accelerate() + stop() + load()[현재 몇kg]
public class Truck extends Car {
	private int loadWeight; // 적재 무게(kg)
	
	public Truck(String name, int fuel, int speed, int year, boolean isEngineOn) {
		super(name, fuel, speed, year, isEngineOn); // 부모 생성자 호출
		this.loadWeight = 0;
	}
	
	// 적재량 출력
	public void load(int loadWeight) {
		this.loadWeight = this.loadWeight + loadWeight;
		System.out.println("현재 적재량: " + this.loadWeight + "kg");
	}
}
