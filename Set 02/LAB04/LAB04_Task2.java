import java.util.Scanner;

/*Take an integer from user, generate that many fibonacci numbers and store in an array.
Display the array.*/
public class LAB04_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		//array declaration
		int[] fibo = new int[n];
		
		int first = 0;
		int second = 1;
		for(int i=0;i<n;i++) {
			fibo[i] = first;
			int temp = first+second;
			first = second;
			second = temp;
		}
		
		//printing the array
		//System.out.println("First "+n+" Fibonacci numbers: ");
		for(int i=0;i<n;i++) {
			System.out.print(fibo[i]+" ");
		}
		
		input.close();
	}

}
