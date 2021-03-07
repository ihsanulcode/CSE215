
import java.util.Scanner;
//import java.util.Random;

public class RandormNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();

        //Random rand = new Random();
        // Generate random integers in range 0 to 999 
        //int rnum = rand.nextInt(10);
        
        //Random rand = new Random();
        //Generate random integers in range 10 to 20 
        //int rnum = rand.nextInt(11)+10;
        
        int rnum = (int) (Math.random() * (num2 - num1)) + num1;
        System.out.print("The random number is: " + rnum + "\n");
        
        input.close();

    }

}
