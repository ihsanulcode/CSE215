import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                
                System.out.println("There are vowels");
                break;
                
            }else{
                
                if(i+1==s.length()){
                    System.out.println("There is no vowels");
                }
                
            }
        }
    }
    
}
