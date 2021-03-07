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
public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive digits: ");
        int digits = input.nextInt();
        
        int sum = 0;
        while(digits!=0){
            sum += digits%10;
            digits/=10;
        }
        System.out.print("Sum of digits: "+sum);
    }
}
