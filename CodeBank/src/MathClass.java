/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value: ");
        double a = input.nextDouble();   
          
        // converting values to radian    
        //double b = Math.toRadians(a);   
          
        // return the trigonometric sine of a      
        System.out.println("Sine value of a is: " +Math.sin(a));    
          
        // return the trigonometric cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cos(a));  
          
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tan(a));  
          
        // return the trigonometric arc sine of a      
        System.out.println("Sine value of a is: " +Math.asin(a));    
          
        // return the trigonometric arc cosine value of a  
        System.out.println("Cosine value of a is: " +Math.acos(a));  
          
        // return the trigonometric arc tangent value of a  
        System.out.println("Tangent value of a is: " +Math.atan(a));  
  
        // return the hyperbolic sine of a      
        System.out.println("Sine value of a is: " +Math.sinh(a));    
          
        // return the hyperbolic cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cosh(a));  
          
        // return the hyperbolic tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tanh(a));
    }
}
