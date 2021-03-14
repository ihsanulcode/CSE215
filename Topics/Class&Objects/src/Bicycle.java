
public class Bicycle {

	public static void main(String[] args) {
		Function cycle = new Function();
		
		cycle.detail();
		
		cycle.speedIn(3);
		cycle.gearIn(2);
		cycle.speedDec(1);
		
		cycle.detail();

	}

}

class Function{
	int gear;
	int speed;
	
	Function(){
		gear = 1;
		speed = 0;
	}
	
	void gearIn(int up) {
		gear+=up;
	}
	
	void gearDec(int dec) {
		gear-=dec;
	}
	
	void speedIn(int up) {
		speed+=up;
	}
	
	void speedDec(int dec) {
		speed-=dec;
	}
	
	void detail() {
		System.out.println("Current speed: "+speed);
		System.out.println("Gear at: "+gear);
	}
}
