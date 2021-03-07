import java.util.Scanner;
public class MultipleOf3and5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		multiple(n);
		
		
	}
	
	public static void multiple(int n) {
		System.out.println("Multiples of Three and Five upto "+n);
		for (int i = 1; i <=n; i++) {
			if(i%3==0 && i%5==0) {System.out.print(i+" ");}
		}
	}

}
