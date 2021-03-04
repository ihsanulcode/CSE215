import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the percentage of increasing tution fees: ");
        int per = input.nextInt();
        
        double total_cost_in_four_years = 0;
        double tution_fee = 10000.0;
        
        for(int i=1;i<=14;i++){
            tution_fee += (tution_fee*(per/100.0));
            
            if(i==10){ //for 10 years
                System.out.printf("Tuition in ten years: $%.3f\n",tution_fee);
            }
            if (i > 10) { //for end 4 years
            total_cost_in_four_years += tution_fee;
           }
        }

        System.out.printf("Total cost for four years after the tenth year: $%.3f\n",total_cost_in_four_years);
    }
    
}
