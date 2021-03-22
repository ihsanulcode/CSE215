import java.util.Scanner;

public class GradingMultipleChoiceTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int row = input.nextInt();
		System.out.print("Enter the number of questions: ");
		int col = input.nextInt();

		// array declaration
		char[][] arr = new char[row][col];

		// getting students answers
		System.out.println("\n\t< Enter students answers >");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\nStudent "+i+":");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("Answer %d> ",j);
				arr[i][j] = input.next().charAt(0);
			}
		}
		
		//getting answers key
		char[] key = new char[col];
		
		System.out.println("\n\t< Enter answer keys >\n");
		for (int i = 0; i < key.length; i++) {
			System.out.printf("Answer %d: ",i);
			key[i] = input.next().charAt(0);
		}

		// display answer sheet
		System.out.println("\n\t< Display >");
		System.out.println("\n\nAnswer sheet: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		
		//display answer keys
		System.out.print("\nAnswer keys: ");
		for (int i = 0; i < key.length; i++) {
			System.out.print(key[i]+" ");
		}
		
		//calculating correct answers
		System.out.println("\n\n\t < Score Board >\n");
		for (int i = 0; i < arr.length; i++) {
			//grade one student 
			int score = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == key[j]) {score++;}
				
			}System.out.println("Student "+i+": Score: "+score);
		}
		
		input.close();
	}

}
