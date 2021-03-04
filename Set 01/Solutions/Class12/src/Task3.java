
public class Task3 {

	public static void main(String[] args) {
		try {
			new Triangle(55, 110, 50);
		} catch (IllegalTriangleException ex) {
			System.out.println(ex);
		}

	}

}

class Triangle {
	double sideA;
	double sideB;
	double sideC;
	boolean legal;

	Triangle() {

	}

	public Triangle(double sideA, double sideB, double sideC)throws IllegalTriangleException{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

		if (sideA + sideB > sideC)

		{
			if (sideB + sideC > sideA) {
				if (sideA + sideC > sideB) {
					legal = true;

				} else {
					throw new IllegalTriangleException();
				}
			} else {
				throw new IllegalTriangleException();
			}

		} else {
			throw new IllegalTriangleException();
		}

	}

}

class IllegalTriangleException extends Exception {
	
	public IllegalTriangleException(){
        super("Invalid triangle!");
    }
}
