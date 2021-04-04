package LAB01;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C;
        System.out.print("Enter a degree in Celsius: ");
        C = input.nextDouble();
        
        double F = ((9*C)/5)+(32);
        System.out.println(""+C+" Celsius is "+F+" Fahrenheit");
    
        input.close();
    }
    
}