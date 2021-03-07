import java.util.Scanner;
public class AreaCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //getting input
        System.out.println("Enter the diameter of the cylinder: ");
        double d = input.nextDouble();
        System.out.println("Enter height of the cylinder: ");
        double h = input.nextDouble();
        
        //call method to calculate area
        area(d,h);
        //call method to calculate peremiter
        perimeter(d,h);
    }
    public static void area(double d,double h){
        double r = (d/2.0);
        double area = (2*3.14*r*h)+(2*3.14*r*r);
        System.out.printf("Area: %.2f\n",area);
    }
     public static void perimeter(double d,double h){
         System.out.printf("Perimeter: %.2f\n",(2*(d+h)));
     }
    
}
