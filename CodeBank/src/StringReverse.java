import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = input.nextLine();
        
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        
    }
}
