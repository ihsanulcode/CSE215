package LAB01;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuity_rate;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuity_rate = input.nextDouble();
        
        double gratuity = subtotal*(gratuity_rate/100);
        double total = subtotal+gratuity;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
        input.close();
    }
    
}
