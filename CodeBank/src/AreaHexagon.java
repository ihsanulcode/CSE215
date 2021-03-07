import java.util.Scanner;
public class AreaHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of the side of the hexagon: ");
        double s = input.nextDouble();
        
        System.out.printf("The area of the hexagon is: %.3f\n",Area(s));
    }
    public static double Area(double s){
        return ((6*s*s)/(4.0*Math.tan(Math.PI/6.0)));
    }
    
}
