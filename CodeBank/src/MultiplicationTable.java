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
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which Multiplcation table you want: ");
        int n = input.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(""+n+"\tX\t"+i+"\t=\t"+n*i);
        }
    }
}
