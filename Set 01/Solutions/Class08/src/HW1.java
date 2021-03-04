
public class HW1 {

	public static void main(String[] args) {

		// testing by creating objects
		MyInteger a = new MyInteger(2020);
		MyInteger b = new MyInteger(2001);
		MyInteger c = new MyInteger(1999);
		MyInteger d = new MyInteger(1971);
		MyInteger e = new MyInteger(2020);

		System.out.println(a.getValue() + " is even: " + a.isEven());
		System.out.println(b.getValue() + " is odd: " + b.isOdd());
		System.out.println(c.getValue() + " is even: " + c.isEven());
		System.out.println(d.getValue() + " is odd: " + d.isOdd());
		System.out.println(e.getValue() + " is even: " + e.isEven());

		//static
		System.out.println("\n201 is odd: "+MyInteger.isOdd(201));

		//equals
		System.out.println(a.value+" is equals to "+e.value+": "+a.equals(e.value));

		//parseInt()
		char[] array = {'2','2','1'};
		System.out.println("Array to Integer: "+MyInteger.parseInt(array));
		System.out.println("Integer: "+MyInteger.parseInt("642"));
	}

}

class MyInteger {
	int value;

	// constructor
	MyInteger(int value) {
		this.value = value;
	}

	// getter method that return value
	public int getValue() {
		return value;
	}

	// check even
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	// check even
	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	// check prime
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (i % value == 0)
				return false;
		}
		return true;
	}

	// static methods
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (i % n == 0)
				return false;
		}
		return true;
	}

	// MyInteger
	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}

	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}

	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}

	// check equals
	public boolean equals(int n) {
		if (n == value)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger n) {
		if (n.value == this.value)
			return true;
		else
			return false;
	}

	// prseInt()
	public static int parseInt(char[] ch) {
		int add = 0;
		// for each loop
		for (char i : ch) {
			add += Character.getNumericValue(i);
		}
		return add;
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
}
