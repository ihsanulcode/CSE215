import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //getting user inputs
        System.out.print("Enter the initial deposite amount: ");
        double deposite_amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double per = input.nextDouble();
        System.out.print("Enter maturity period (number of months) : ");
        int months = input.nextInt();
        
        //calculation and table display
        for(int i=1;i<=months;i++){
            deposite_amount += deposite_amount*(per/1200.0);
            System.out.printf(i+" %.2f\n",deposite_amount);
        }
    }
    
}
