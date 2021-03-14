
public class TV {

	public static void main(String[] args) {
		control tv = new control();
		
		tv.powerbutton();
		
		tv.setChannel(20);
		tv.setVolume(30);
		
		tv.powerbutton();
		
		tv.info();

	}
}
class control{
	private int channel;
	private int volume;
	private boolean isOn;
	
	control(){
		channel = 1;
		volume = 20;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	public void volUp() {
		volume++;
	}
	
	public void volDown() {
		volume--;
	}
	
	public void info() {
		if(isOn==false) {
			System.out.println("Tv is off");
		}else {
			System.out.println("Channel: "+channel);
			System.out.println("Volume : "+volume);
		}
		
	}
	
	public void powerbutton() {
		if(isOn==true) {
			isOn = false;
		}else {
			isOn = true;
		}
	}
}