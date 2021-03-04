import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //getting user input
        System.out.print("Enter the tution fee: ");
        double tution_fee = input.nextDouble();
        System.out.print("Enter the percentage of increasing tution fees: ");
        int per = input.nextInt();
        
        double total_cost_in_four_years = 0;
        
        //calculation
        for(int i=1;i<=14;i++){
            tution_fee += (tution_fee*(per/100.0));
            
            if(i==10){ //for 10 years
                System.out.printf("Tuition in ten years: $%.2f\n",tution_fee);
            }
            if (i > 10) { //for end 4 years
            total_cost_in_four_years += tution_fee;
           }
        }

        System.out.printf("Total cost for four years after the tenth year: $%.2f\n",total_cost_in_four_years);
    }
   
}
