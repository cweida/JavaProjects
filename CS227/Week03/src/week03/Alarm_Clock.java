package week03;

public class Alarm_Clock {

	private int Hour;
	private int Minute;
	private boolean Alarm;
	
public Alarm_Clock() {
		
		Hour = 12;
		Minute = 00;
		Alarm = false;
	}
	
public Alarm_Clock(int givenHour, int givenMinute) {
		
		Hour = givenHour;
		Minute = givenMinute;
		
		
	}
	
public void hour() {
		
		Hour += 1;
		if (Hour >= 24) {
			Hour = 0;
		}
		
	}
public void minute() {
		
		Minute += 1;
		if (Minute >= 60) {
			Minute = 0;
		}
		
	}
public boolean isAlarmOn() {
	return Alarm;
	}
	
public String toString() {
	if (Minute < 10) {
		String AlarmTime = new String(Hour + ":0" + Minute);
		return AlarmTime;
		
	}
	else {
		String AlarmTime = new String(Hour + ":" + Minute);
		return AlarmTime;
	}
	
	
}



}
