import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaration
        int n;
        int sum = 0;
        int count= 0;
        
        //getting inputs
        do{
            System.out.print("Enter integer ( Press 0 to STOP ): ");
            n = input.nextInt();
            sum += n;
            count++;
        }while(n!=0);
        
        //call method to calculate average
        double avg = average(sum,count-1);
        //call method to print result
        display(sum,avg);
    }
    public static double average(int sum,int count){
        return ((double)sum/count);
    }
    public static void display(int sum,double avg){
        System.out.println("Sum: "+sum);
        System.out.printf("Average: %.2f\n",avg);
    }

    

}
