
public class Task2 {

	public static void main(String[] args) {
		SoccerPlayer[] c = new SoccerPlayer[3];

		c[0] = new Forward("A", "20", 30);
		c[1] = new Midfielder("B", "25", 10);
		c[2] = new Defender("c", "18", 60);

		System.out.println("\n----- Display -----");
		for (int i = 0; i < c.length; i++) {
			System.out.println();

			c[i].profile();
		}
	}

}

class SoccerPlayer {
	private String name;
	private String age;

	SoccerPlayer(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String toString() {
		return null;
	}

	public void profile() {

	}
}

class Forward extends SoccerPlayer {
	private int goal;

	Forward(String name, String age, int goal) {
		super(name, age);
		this.goal = goal;
	}

	public void profile() {
		System.out.println("Forward");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Goal: " + goal);
	}

}

class Midfielder extends SoccerPlayer {
	private int assist;

	Midfielder(String name, String age, int assist) {
		super(name, age);
		this.assist = assist;
	}

	public void profile() {
		System.out.println("Midfielder");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Assiste: " + assist);
	}
}

class Defender extends SoccerPlayer {
	private int save;

	Defender(String name, String age, int save) {
		super(name, age);
		this.save = save;
	}

	public void profile() {
		System.out.println("Defender");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Save: " + save);
	}
}
