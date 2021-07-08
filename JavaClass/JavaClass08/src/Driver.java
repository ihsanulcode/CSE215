
public class Driver {

	public static void main(String[] args) {
		
		Car BMW = new Car("BMW M3","BLACK",100000);
		Car AUDI = new Car("AUDI X3","WHITE",50000);
		
		BMW.printDetails();
		System.out.println();
		AUDI.printDetails();

	}

}
