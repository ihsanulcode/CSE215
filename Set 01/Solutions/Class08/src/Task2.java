
public class Task2 {

	public static void main(String[] args) {
		
		//Time objects
		Time t1 = new Time(555550000L);
		Time t2 = new Time();
		
		//printing 1
		System.out.println(""+t1.gethour()+":"+t1.getMin()+":"+t1.getsec());
		System.out.println(""+t2.gethour()+":"+t2.getMin()+":"+t2.getsec());

		//sending a millisecond time to t2 object and print 
		t2.setTime(1000000000L); 
		System.out.println(""+t2.gethour()+":"+t2.getMin()+":"+t2.getsec());
	}
}	
	class Time{
		private int hour;
		private int min;
		private int sec;
		private long time;
		
		//no argument constructor
		Time(){
			time = System.currentTimeMillis();
		}
		
		public Time(long time) {
			this.time = time;
		}
		
		public Time(int hour, int min, int sec) {
			this.hour = hour;
			this.min  = min;
			this.sec  = sec;
		}
		
		//3 getter methods
		public int gethour() {
			int convertedHour = (int)(time/(1000*3600))%24;
			return convertedHour;
		}
		
		public int getMin() {
			int convertedMin = (int)(time/(1000*60))%60;
			return convertedMin;
		}
		
		public int getsec() {
			int convertedsec = (int)((time/1000)%60);
			return convertedsec;
		}
		
		//long elapsedTime method
		public void setTime(long elapsedTime) {
			this.time = elapsedTime;
		}
	}

