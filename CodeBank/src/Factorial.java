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
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to calculate it's factorial: ");
        int n = input.nextInt();
        
        int fact = 1;
        for(int i=n;i>=1;i--)
            fact*=i;
        
        System.out.println(""+n+"! > "+fact);
    }
    
}
