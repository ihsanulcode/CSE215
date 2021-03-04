public class Dog extends Pet {
	Dog(String name, String color) {
		setName(name);
		setColor(color);
	}

	public String toString() {
		return getName();
	}

	public String Sound() {
		return "woof woof";
	}
}