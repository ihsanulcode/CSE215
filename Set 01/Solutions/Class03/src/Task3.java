import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose an operator: +,-,*, or /: ");
        char ch = input.next().charAt(0);
        
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        
        switch(ch)
        {
            case '+' :
                System.out.printf("%.2f + %.2f = %.2f",a,b,(a+b));
                break;
            case '-' :
                System.out.printf("%.2f - %.2f = %.2f",a,b,(a-b));
                break;
            case '*' :
                System.out.printf("%.2f * %.2f = %.2f",a,b,(a*b));
                break;
            case '/' :
                System.out.printf("%.2f / %.2f = %.2f",a,b,(a/b));
                break;
            default :
                System.out.println("Invalid operator!");

    }
    }
}
