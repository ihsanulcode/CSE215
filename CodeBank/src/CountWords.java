import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = input.nextLine();
        
        if(s==null||s.isEmpty()){
            System.out.println("Words: 0");
        }else{
            String[] words = s.split("\\s+");
            System.out.println("Words: "+words.length);
        }
    }
    
}
