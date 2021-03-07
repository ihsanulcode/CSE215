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
public class nCr {
    static int factorial(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        System.out.print("r: ");
        int r = input.nextInt();
        
        int combination = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(""+n+"C"+r+" : "+combination);
    }
    
}
