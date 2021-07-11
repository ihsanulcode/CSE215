
public class Remote {

	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.powerButton();
		
		tv.channelUp();
		tv.channelUp();
		
		tv.volumeUp();
		tv.volumeUp();
		
		tv.setChannel(35);
		tv.setVolume(80);
		tv.info();
	}

}
