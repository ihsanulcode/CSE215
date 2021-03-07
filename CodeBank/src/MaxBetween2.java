import java.util.Scanner;
public class MaxBetween2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();
        int max = max(n1,n2);
        System.out.println("Max: "+max);
        //System.out.println("MAX: "+max(max,100));
    }
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
