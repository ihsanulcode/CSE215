package LAB01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in KG: ");
		double M = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double initialT = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double finalT = input.nextDouble();
		
		double Q = M*(finalT-initialT)* 4184;
		System.out.println("The energy needed is "+Q);
		
		input.close();

	}

}
