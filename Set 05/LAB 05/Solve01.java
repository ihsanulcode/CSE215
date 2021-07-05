import java.util.Scanner;

public class Solve01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[10];
		System.out.println("Enter ten numbers: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		
		int odd[] = odd(arr);
		System.out.println("Odd Numbers: ");
		for (int i : odd) {
			System.out.print(i+" ");
		}
		
		even(arr);
		int max = max(arr);
		System.out.println("Max number: "+max);
		min(arr);
		
		input.close();
	}

	public static int[] odd(int numbers[]) {
		int size = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2 != 0) {
				size++;
			}
		}
		
		int arr[] = new int[size];
		int index = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2 != 0) {
				arr[index] = numbers[i];
				index++;
			}
		}
		return arr;
	}
	
	public static void even(int numbers[]) {
		int sum = 0;
		int count = 0;
		System.out.println("\nEven Numbers: ");
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2 == 0) {
				System.out.print(numbers[i]+" ");
				sum += numbers[i];
				count++;
			}
		}
		System.out.println("\nEven sum: "+sum);
		System.out.println("Even average: "+(sum/(double)count));
	}
	
	public static int max(int numbers[]) {
		int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }return max;
	}
	public static void min(int numbers[]) {
		int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Min numbers: "+min);
	}
	
}