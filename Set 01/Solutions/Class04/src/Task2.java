import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter digits: ");
        long digits = input.nextLong();
        
        int sum = sumDigits(digits);
        System.out.println("Sum of digits: "+sum);
    }
    public static int sumDigits(long n){
        
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        
        return sum;
    }
    
}
