package LAB01;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v;
        double a;
        System.out.println("Enter speed and acceleration: ");
        v = input.nextDouble();
        a = input.nextDouble();
        
        double length = (v*v)/(2.0*a);
        System.out.println("The minimum runway length for the airplane is "+length);
        input.close();
    }
    
}