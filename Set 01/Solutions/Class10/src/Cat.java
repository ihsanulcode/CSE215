public class Cat extends Pet {
	Cat(String name, String color) {
		setName(name);
		setColor(color);
	}

	public String toString() {
		return getName();
	}

	public String Sound() {
		return "meow meow";
	}
}