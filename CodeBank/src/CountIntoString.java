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
public class CountIntoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();
    
        int upper = 0,lower = 0, vowel = 0,consonant = 0,digit = 0,punc = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c>=65&&c<=90){
                upper++;
            }
            
            if(c>=97&&c<=122){
                lower++;
            }
            
            
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowel++;
            }
            else if(c>=48&&c<=57){
                digit++;
            }
            else if(c!='.'&&c!=','&&c!='!'&&c!='?'&&c!='"'&&c!='"'&&c!=' '){
                consonant++;
            }

            if(c=='.'||c==','||c=='!'||c=='?'){
                
                punc++;
            }
        }
        
        System.out.println("Number of uppercase letters: "+upper);
        System.out.println("Number of lowercase letters: "+lower);
        System.out.println("Number of vowels           : "+vowel);
        System.out.println("Number of consonants       : "+consonant);
        System.out.println("Number of punctuation marks: "+punc);
        System.out.println("Number of numerical digits : "+digit);
        
    }
}
