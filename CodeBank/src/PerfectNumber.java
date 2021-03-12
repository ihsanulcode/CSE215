import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		//output
		for(int i=2;i<=n;i++) {
			if(isPerfectNumber(i) == 1)
				System.out.print(i+" ");
		}
		
		input.close();
	}

	public static int isPerfectNumber(int n) {
		
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum+=i;
			}

		}
		
		if(n == sum)
			return 1;
		else
			return 0;
	}

}
