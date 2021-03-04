import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		//user input
		System.out.print("Enter an integer: ");
		int index = input.nextInt();
		
		try {
			System.out.println("Index: "+index+" Element: "+arr[index]);
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("Invalid index!");
		}
		
		input.close();

	}

}
