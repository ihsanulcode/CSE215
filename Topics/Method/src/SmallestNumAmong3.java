import java.util.Scanner;
public class SmallestNumAmong3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the first  number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third  number: ");
        int c = input.nextInt();
        
        int min = smallest(a,b);
        int small = smallest(min,c);
        
        System.out.println("Smallest: "+small);
    }
    public static int smallest(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
