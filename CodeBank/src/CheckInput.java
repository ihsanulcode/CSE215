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
public class CheckInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        do{
            System.out.print("Enter any character(Enter @ to stop) : ");
            ch = input.next().charAt(0);

            
            if(ch>=48&&ch<=57){
                System.out.println("Digit - ASCII CODE "+(int)ch);
            }else if(ch>=65&&ch<=90){
                System.out.println("Upper Case Letter - ASCII CODE "+(int)ch);
            }else if(ch>=97&&ch<=122){
                System.out.println("Lower Case Letter - ASCII CODE "+(int)ch);
            }else{
                System.out.println("Special character - ASCII CODE "+(int)ch);
            }
        }while(ch!='@');
    }
}
