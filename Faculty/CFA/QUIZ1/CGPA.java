import java.util.Scanner;  

public class CGPA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the number of courses: ");
		int courses = input.nextInt();
		
		double[] marks = new double[courses];
		double[] credit = new double[courses];
		double[] Gpoint = new double[courses];
		
		for(int i=0;i<courses;i++) {
			System.out.println("Course "+(i+1)+": ");
			System.out.println("Final marks: ");
			marks[i] = input.nextDouble();
			Gpoint[i] = G_Point(marks[i]);
			System.out.println("Credit hours: ");
			credit[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		double totalCreditH = 0.0;
		for(int i=0;i<courses;i++) {
			sum += (credit[i]*Gpoint[i]);
			totalCreditH += credit[i];
		}
		
		double CGPA = sum/totalCreditH;
		System.out.printf("\nCGPA: %.2f",CGPA);
	}
	
	public static double G_Point(double marks) {
		if(marks >= 73.0 && marks <= 76.0) {
			return 2.0;
		}else if(marks >= 77.0 && marks <= 79.0){
			return 2.3;
		}else if(marks >= 80.0 && marks <= 82.0){
			return 2.7;
		}else if(marks >= 83.0 && marks <= 86.0){
			return 3.0;
		}else if(marks >= 87.0 && marks <= 89.0){
			return 3.3;
		}else if(marks >= 90.0 && marks <= 92.0){
			return 3.7;
		}else if(marks >= 93.0){
			return 4.0;
		}else {
			return 0.0;
		}
	}

}
