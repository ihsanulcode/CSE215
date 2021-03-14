import java.io.*;
import java.util.*;

public class LAB06_Task {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	int a1 = input.nextInt();
    	int b1 = input.nextInt();
    	int a2 = input.nextInt();
    	int b2 = input.nextInt();
    	
        Fraction fraction1 = new Fraction(a1,b1);
        Fraction fraction2 = new Fraction(a2,b2);
        Fraction fraction = new Fraction();
        
        fraction.add(fraction1,fraction2);
        
        
        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());
        System.out.println(fraction.toString());
    }
}

class Fraction{
    private int numerator;
    private int denominator;
    
    Fraction(){
    	
    }
    
    Fraction(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void add(Fraction a,Fraction b){
    	this.numerator = a.numerator * b.denominator + b.numerator * a.denominator;
    	this.denominator = a.denominator * b.denominator;
    	
    	if(denominator % numerator == 0) {
    		denominator =  denominator /  numerator; 
    		numerator = 1;
    	}
    }
    
    public String toString() {
    	return numerator+"/"+denominator;
    }
}