package LAB01;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w,h;
        System.out.print("Enter weigth in pounds: ");
        w = input.nextDouble();
        System.out.print("Enter height in inches: ");
        h = input.nextDouble();
        
        w *= 0.45359237;
        h *= 0.0254;
        
        double BMI =  (w)/(h*h);
        System.out.println("BMI is "+BMI);
        
        input.close();
    }
    
}