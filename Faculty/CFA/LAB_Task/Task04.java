
/*
 * 4.Create an interface 'Animals1' with two abstract methods 'cats1' and 'dogs1'. 
 * Now create a class 'Cats1' with a method 'cats1' which prints "Cats meow" and a class 'Dogs1' with a method 'dogs1' which prints "Dogs bark", 
 * both implement the interface 'Animals1'. Now create an object for each of the subclasses and call their respective methods.
 */

interface Animals1 {
	void cats1();

	void dogs1();
}

class Cats1 implements Animals1 {

	@Override
	public void cats1() {
		System.out.println("Cats meow");

	}

	@Override
	public void dogs1() {
		// I don't need this method in this class

	}

}

class Dogs1 implements Animals1 {

	@Override
	public void cats1() {
		// I don't need this method in this class

	}

	@Override
	public void dogs1() {
		System.out.println("Dogs bark");
	}

}

public class Task04 {

	public static void main(String[] args) {
		Cats1 c = new Cats1();
		Dogs1 d = new Dogs1();
		
		c.cats1();
		d.dogs1();
	}

}
