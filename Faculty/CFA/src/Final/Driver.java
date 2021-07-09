package Final;

public class Driver {

	public static void main(String[] args) {
		
		UnderGraduateStudent BS_CSE = new UnderGraduateStudent("Jon Doe",3.80,9,4,1814994642,"BS in CSE");
		UnderGraduateStudent BS_EEE = new UnderGraduateStudent("Jon Snow",3.50,9,5,1812884643,"BS in EEE");
		
		System.out.println(BS_CSE.toString());
		System.out.println(BS_EEE.toString());
		
		System.out.println("Comparison: "+BS_CSE.getName()+" vs "+BS_EEE.getName());
		System.out.println(BS_CSE.getName()+".compareCGPA("+BS_EEE.getName()+"): "+BS_CSE.compareCGPA(BS_EEE));
		System.out.println(BS_CSE.getName()+".compareSemester("+BS_EEE.getName()+"): "+BS_CSE.compareSemester(BS_EEE));
		System.out.println(BS_CSE.getName()+".compareSemesterFee("+BS_EEE.getName()+"): "+BS_CSE.compareSemesterFee(BS_EEE));
		
		GraduateStudent MS_CSE = new GraduateStudent("Devid Bakhum",3.80,5,3,1914994642,"MS in CSE");
		GraduateStudent MS_EEE = new GraduateStudent("Jason Sthatham",3.66,4,3,2012884643,"MS in EEE");
		
		System.out.println("\n"+MS_CSE.toString());
		System.out.println(MS_EEE.toString());
		
		System.out.println("Comparison: "+MS_CSE.getName()+" vs "+MS_EEE.getName());
		System.out.println(MS_CSE.getName()+".compareCGPA("+MS_EEE.getName()+"): "+MS_CSE.compareCGPA(MS_EEE));
		System.out.println(MS_CSE.getName()+".compareSemester("+MS_EEE.getName()+"): "+MS_CSE.compareSemester(MS_EEE));
		System.out.println(MS_CSE.getName()+".compareSemesterFee("+MS_EEE.getName()+"): "+MS_CSE.compareSemesterFee(MS_EEE));
		
		System.out.println("\nComparison: "+MS_CSE.getName()+" vs "+BS_CSE.getName());
		System.out.println(MS_CSE.getName()+".compareCGPA("+BS_CSE.getName()+"): "+MS_CSE.compareCGPA(BS_CSE));
		System.out.println(MS_CSE.getName()+".compareSemester("+BS_CSE.getName()+"): "+MS_CSE.compareSemester(BS_CSE));
		System.out.println(MS_CSE.getName()+".compareSemesterFee("+BS_CSE.getName()+"): "+MS_CSE.compareSemesterFee(BS_CSE));

	}

}
