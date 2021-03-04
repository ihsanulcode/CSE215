
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        String copy = s1;
        
        StringBuilder reverse = new StringBuilder(s1); 
        reverse.reverse(); 
        
        String rev = reverse.toString();
        
        if(s1.equals(rev)){
            System.out.println(copy+" is a palindrome");
        }else{
            System.out.println(copy+" is not a palindrome");
        }
        
        
        
    }
    
}
