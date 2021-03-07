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
public class PrimeInterval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Start: ");
        int start = input.nextInt();
        System.out.print("End: ");
        int end = input.nextInt();
        
        int flag = 0;
        for(int i=start;i<=end;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(i);
            
            flag = 0;
                
        }
    }
}
