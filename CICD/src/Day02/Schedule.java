package Day02;

public class Schedule {
	private String day;
	private int open;
	private int close;
	
	public Schedule(String day, int open, int close) {
		this.day = day;
		this.open = open;
		this.close = close;
	}
	
	public void timetable() {
		System.out.println("요일: " + this.day);
		System.out.println("출근 시간: " + this.open);
		System.out.println("퇴근 시간: " + this.close);
	}
}
