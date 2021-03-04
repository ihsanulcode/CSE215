import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0 : ");
        
        int positive_count = 0;
        int negative_count = 0;
        int sum = 0;
        float count = 0;
        int n;
        
        do{
            n = input.nextInt();
            count++;
            
            if(n!=0){
                sum+=n;
            }
            
            if(n>0){
                positive_count++;
            }else if(n<0){
                negative_count++;
            }
        }while(n!=0);
        
        System.out.println("The number of positives is "+positive_count);
        System.out.println("The number of negatives is "+negative_count);
        System.out.printf("The total is %.1f The average is %.2f",count,(sum/(count-1)));
        
    }
    
}
