package Day05.theory;

// 1. 인터페이스
// 2. 외부 생성 + 주입
public class Robot {
	private Battery battery;
	
	public Robot(Battery battery) {
		this.battery = battery;
	}
	
	void operate() {
		this.battery.supply();
		System.out.println("로봇 작동!");
	}
}
