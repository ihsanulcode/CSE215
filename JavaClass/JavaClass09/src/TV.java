
public class TV {
	//data fields
	int channel;
	int vol;
	boolean isOn;
	
	//default constructor
	TV(){
		this.channel = 1;
		this.vol = 20;
	}
	
	//methods
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.vol = volume;
	}
	
	public void channelUp() {
		this.channel++;
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	public void volumeUp() {
		this.vol++;
	}
	public void volumeDown() {
		this.vol--;;
	}
	
	public void powerButton() {
		if(isOn==true) {
			this.isOn = false;
		}else {
			this.isOn = true;
		}
	}
	
	public void info() {
		if(isOn==false) {
			System.out.println("Tv is off!");
		}else {
			System.out.println("Current channel: "+this.channel);
			System.out.println("Current volume: "+this.vol);
		}
	}

}
