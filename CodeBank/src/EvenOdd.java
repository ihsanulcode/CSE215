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
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        
        if(n%2==0)
            System.out.println("Even");
        else 
            System.out.println("Odd");
    }
            
    
}
