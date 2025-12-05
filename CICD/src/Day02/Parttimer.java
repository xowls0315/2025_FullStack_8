package Day02;

// Parttimer [name, age, hourlyWage, schedule] + 시급조정 함수
public class Parttimer {
	private String name;
	private int age;
	private int hourlyWage;
	private Schedule schedule;
	
	public Parttimer(String name, int age, int hourlyWage) {
		this.name = name;
		this.age = age;
		this.hourlyWage = hourlyWage;
		this.schedule = new Schedule("금", 10, 14);
	}
	
	// 시급 조정 함수
	public void adjustHourlyWage(int newWage) {
		if (newWage < 10000) {
			System.out.println("노동청 신고 ㄱ");
		} else {
			System.out.println("시급을 " + this.hourlyWage + "원 → " + newWage + "원으로 조정했습니다.");
			this.hourlyWage = newWage;
		}
	}
	
	// Parttimer 정보 출력 함수
	public void printInfo() {
		System.out.println("알바생 이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("시급: " + hourlyWage);
		this.schedule.timetable();
		System.out.println("------------------------------");
	}
}
