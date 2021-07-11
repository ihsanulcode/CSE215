
public class Overloading_Task {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1.5, 2.5));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1.5, 2.5, 3.5));
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

}
