import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();
        
        int num1 = n1;
        int num2 = n2;
        
        while(n2 != 0)
        {
            int reminder = n1%n2;
            n1 = n2;
            n2 = reminder;
        }
        System.out.println("GCD: "+n1);
        
        //gcd = n1;
        //lcm = (number1*number2)/gcd;
        //printf("\nLCM: %d",lcm);

    }
    
}
