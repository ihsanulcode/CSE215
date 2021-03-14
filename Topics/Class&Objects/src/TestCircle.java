
public class TestCircle {

	public static void main(String[] args) {
		
		//created instance and called for unit circle
		circle unitCircle = new circle();
		
		System.out.println("The Unit Circle:");
		System.out.printf("\nDiameter     :\t%.2f",unitCircle.getDiameter());
		System.out.printf("\nArea         :\t%.2f",unitCircle.getArea());
		System.out.printf("\nCircumference:\t%.2f",unitCircle.getCircumference());
		
	}
	
	static class circle{
		double radius;
		
		//no argument constructor
		circle(){
			this.radius = 1.0;
		}
		
		//argument constructor
		circle(double r){
			this.radius = r;
		}
		
		//return area
		double getArea() {
			return Math.PI*Math.pow(radius, 2);
		}
		
		//return diameter
		double getDiameter() {
			return 2*radius;
		}
		
		//return circumference
		double getCircumference() {
			return 2*Math.PI*radius;
		}
	}
}
