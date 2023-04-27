package studio8;


public class Time {
	private int minute;
	private int hour;
	private boolean is24;
	
	public Time(int initHour, int initMinute, boolean initIs24) {
		minute = initMinute;
		is24 = initIs24;
		if (is24 == false && initHour > 12){
			hour = initHour - 12;
		}
		else {
			hour = initHour;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Time [minute=" + minute + ", hour=" + hour + "]";
	}



	public static void main(String[] args) {
		Time time1 = new Time(11, 45, false);
		System.out.print(time1.toString());
		
    }

}