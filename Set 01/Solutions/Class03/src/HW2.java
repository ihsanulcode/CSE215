import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //getting String from user
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        
        //Declaring a String to store the prefix 
        String s3 = "";
        
        //compute then length for loop control
        int length = s1.length();
        
        //compareing char by char using loop
        for(int index=0;index<length;index++){
            if(s1.charAt(index)==s2.charAt(index)){
                s3 += s1.charAt(index);
            }
        }
        
        //result
        if(s3!=null){
            System.out.println("The common prefix is "+s3);
        }else{
            System.out.println("No common prefix found!");
        }
        
    }
    
}
