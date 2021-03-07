
import java.util.Scanner;
public class AreaTriangle {
    public static double getbase(){
        System.out.print("Enter base: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        return base;
    }
    public static double getheight(){
        System.out.print("Enter height: ");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        return height;
    }
    public static double Area(double base,double height){
        double area = 0.5*base*height;
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double b = getbase();
        //double h = getheight();
        double area = Area(getbase(),getheight());
        System.out.println("Area of the triangle: "+area);
    }
}
