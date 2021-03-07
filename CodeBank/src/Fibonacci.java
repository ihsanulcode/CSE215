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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter series length: ");
        int n = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        for(int i=1;i<=n;i++){
            System.out.print(" "+first);
            fibo = first+second;
            first = second;
            second = fibo;
        }
    }
    
}
