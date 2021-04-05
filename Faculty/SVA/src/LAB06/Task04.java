package LAB06;

public class Task04 {

	public static void main(String[] args) {

		// objects for two fans
		Fan f1 = new Fan();
		Fan f2 = new Fan();

		// assigning speed, radius, color, set on for fan1
		f1.turnon();
		f1.setspeed(2);
		f1.setradius(20.5);
		f1.setcolor("Cyan");

		// assigning radius, color, set off for fan2
		f2.turnoff();
		f2.setradius(10.5);
		f2.setcolor("BLACK");

		// printing
		System.out.println(f1.toString());
		System.out.println(f2.toString());

	}
}

class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	// no argument constructor
	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	// setter methods
	public void setspeed(int speed) {
		this.speed = speed;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void setradius(Double radius) {
		this.radius = radius;
	}

	public void turnon() {
		on = true;
	}

	public void turnoff() {
		on = false;
	}

	// getter methods
	public boolean ison() {
		return on;
	}

	public double getradius() {
		return radius;
	}

	public String getcolor() {
		return color;
	}

	public String getspeed() {
		if (this.speed == SLOW)
			return "SLOW";
		else if (this.speed == MEDIUM)
			return "MEDIUM";
		else
			return "FAST";
	}

	// toString
	public String toString() {
		if (on == true) {
			String s = "Fan speed: " + getspeed() + "\nColor: " + color + "\nRadius: " + radius + "\n";
			return s;

		} else {
			String s = "Fan color: " + color + "\nRadius: " + radius + "\nFan is off\n";
			return s;
		}
	}

}
