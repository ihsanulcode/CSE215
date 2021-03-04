
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter any number: ");
        int n = input.nextInt();
        
        //method
        convert(s);
        convert(n);

    }
    
    public static void convert(String s){
        System.out.println("String to number: "+String.valueOf(s));
    }
    
    public static void convert(int n){
        String str = Integer.toString(n);
        System.out.println("Number to String: "+str);
    }

}
