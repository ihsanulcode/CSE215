import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		String output = fizzbuzz(n);
		System.out.println(output);
		
	}
	
	public static String fizzbuzz(int n) {
		if(n>=0) {
			if(n%3==0 && n%5==0)return "FizzBuzz";
			else if(n%3==0) return "Fizz";
			else if(n%5==0) return "Buzz";
			else return Integer.toString(n);
		}else {
			return Integer.toString(n);
		}
	}

}
