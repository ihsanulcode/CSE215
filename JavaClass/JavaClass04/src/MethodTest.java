//write a program to calculate sum of three numbers using methods.
public class MethodTest {

	public static void main(String[] args) {

		int ans = sum(1, 2, 3);
		System.out.println("Sum: " + ans);
		
		System.out.print("Print Number: ");
		printNumber(100);
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void printNumber(int a) {
		System.out.println(a);
		
	}

}
