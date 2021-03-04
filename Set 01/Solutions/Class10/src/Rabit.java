public class Rabit extends Pet {
	Rabit(String name, String color) {
		setName(name);
		setColor(color);
	}

	public String toString() {
		return getName();
	}

	public String Sound() {
		return "squeak squeak";
	}
}