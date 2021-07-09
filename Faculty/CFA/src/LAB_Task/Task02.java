package LAB_Task;

/*
 * 2. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
 * Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints 
 * "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods. 
 * 
 */

abstract class Animal {
	public abstract void cats();

	public abstract void dogs();
}

class Cats extends Animal {

	@Override
	public void cats() {
		System.out.println("Cats meow");

	}

	@Override
	public void dogs() {
		// I don't need this method

	}

}

class Dogs extends Animal{

	@Override
	public void cats() {
		// I don't need this method 
		
	}

	@Override
	public void dogs() {
		System.out.println("Dogs bark");
		
	}
	
}
public class Task02 {

	public static void main(String[] args) {
		Cats c = new Cats();
		Dogs d = new Dogs();
		
		c.cats();
		d.dogs();

	}

}
