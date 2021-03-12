import java.util.Scanner;
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        //array declaration
        int[] array = new int[size];
        
        //getting elements;
        getInput(array);
        
        //display
        System.out.println("From main method(): ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t",array[i]);   
        }
        
        //max
        int max = ArrayMax(array);
        //max
        int min = ArrayMin(array);
        
        System.out.printf("\nMAX: %d\nMIN: %d\n",max,min);
    }
    public static void getInput(int[] arr){
        Scanner input = new Scanner(System.in);
        
        //getting elements input
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = input.nextInt();
        }
  
    }
    public static int ArrayMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }return max;
         
    }
    public static int ArrayMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }return min;
          
    }
    
}
