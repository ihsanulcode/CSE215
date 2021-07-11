
public class Bicycle {

	public static void main(String[] args) {

		Bicycle c = new Bicycle();

		c.speedUp();
		c.gearUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.gearUp(2);
		c.info();

		c.breakCycle();
		c.info();

	}

	// data
	int gear;
	int speed;

	// constructor
	Bicycle() {
		gear = 1;
		speed = 0;
	}

	// methods
	public void gearUp() {
		gear++;
	}

	public void gearUp(int gear) {
		this.gear += gear;
	}

	public void gearDown() {
		gear--;
	}

	public void gearDown(int gear) {
		this.gear -= gear;
	}

	public void speedUp() {
		speed++;
	}

	public void speedDown() {
		speed--;
	}

	public void breakCycle() {
		this.speed = 0;
	}

	public void info() {
		System.out.println("Current speed: " + this.speed);
		System.out.println("Gear at: " + this.gear);
	}

}
