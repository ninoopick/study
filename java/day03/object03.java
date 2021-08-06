package test3;

public class object03 {
	public static void main(String[] args) {
		
	}
}
class Time{
	private int hour;
	private int minute;
	private float second;
	
	public void setHour(int h ) {
		if(h < 0 || h > 23) return;
		hour = h;
	}
}
