package klockan;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic {
	
	private int alarmHour;
	private int alarmMinute;
	private DigitalClockGUI clockGui;
	private ClockLogic clockThread;
	
	
	
	
	public ClockLogic(DigitalClockGUI clockGui){
		this.clockGui = clockGui;

		new ClockThread().start();; 
	}
	
	



	private class ClockThread extends Thread{
		@Override
		public void run(){
			DecimalFormat decimalFormat = new DecimalFormat("00");
			while(true){
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int minute = c.get(Calendar.MINUTE);
				int sec = c.get(Calendar.SECOND);
				
				clockGui.setTimeOnLabel("" +decimalFormat.format(hour) + ":" + decimalFormat.format(minute) + ":" + decimalFormat.format(sec));
				
				
				try {
					Thread.sleep(900);
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
				
			}
		}
	}

}
