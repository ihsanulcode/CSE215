//112+122+132+142+......+1n2
import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = in.nextInt();

		int num = 112;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println(num + " ");
			sum += num;
			num += 10;
		}
		System.out.println("Summation: " + sum);
		in.close();
	}
}
