import java.util.Scanner;
public class Distance2Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("X1: ");
        int x1 = input.nextInt();
        System.out.print("Y1: ");
        int y1 = input.nextInt();
        System.out.print("X2: ");
        int x2 = input.nextInt();
        System.out.print("Y2: ");
        int y2 = input.nextInt();
        
        double distance = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        System.out.println("Distance between two points: "+distance);
    }
}
