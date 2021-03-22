import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			int temp = input.nextInt();
			sum += temp;
		}
		
		System.out.println("Average : "+CalculateAvg(sum,n));
		input.close();
	}
	
	public static double CalculateAvg(int sum,int n) {
		return (sum/(double)n);
	}
}
