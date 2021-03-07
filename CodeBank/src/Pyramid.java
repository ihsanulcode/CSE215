import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter rows: ");
        int n = input.nextInt();
        
        for(int row=1;row<=n;row++)
        {
        for(int col=1;col<=n-row;col++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print("*");
                    
        }
        for(int col=row-1;col>=1;col--)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        }

    }
    
}
