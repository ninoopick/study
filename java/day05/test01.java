package test5;

class Time{
	private int hour;			// 0~23 사이값을 가져야 함
	private int minute;
	private int second;

	
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		
		this.hour = hour;
	}
	
	public int getHour() { return hour;}
}

public class test01 {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21); 	// hour 의 값을 21로 변경
		System.out.println(t.getHour());
		
		t.setHour(100);	// 위 조건이 충족하지않아서 안됨
		System.out.println(t.getHour());
		
	}
}
