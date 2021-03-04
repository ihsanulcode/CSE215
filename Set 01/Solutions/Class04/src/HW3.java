
import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting inputs
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annual_interest = input.nextDouble();

        //printing 1 to 30 months table
        for (int i = 1; i <= 30; i++) {
            System.out.printf("\n" + i + " \t%.2f", futureInvestmentValue(amount, annual_interest, i));
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        monthlyInterestRate = (monthlyInterestRate / 100.0) / 12;
        double res = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return res;
    }

}
