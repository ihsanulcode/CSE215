//Generate a random int between 1990 and 2020. Then print it check if it’s a leap year or not
public class LAB03_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generate random year Range: 1990-2020
		int year = (int) (Math.random()*(2020-1990+1)+1990);
		
		// checking
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("" + year + " is a leap year.");
		else
			System.out.println("" + year + " is not a leap year.");

	}

}
