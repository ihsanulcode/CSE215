
public class Lab2_Task3 {

	public static void main(String[] args) {

		// pattern printing using for loop
		int star = 1;
		int plus = 1;
		for (int i = 1; i <= 5; i++) {

			if(i%2!=0) {
				for(int j=1;j<=star;j++)
					System.out.print("*");
			}
			
			
			if(i%2==0) {
				for(int j=1;j<=plus;j++)
					System.out.print("+");
			}
			System.out.println();
			
			star += 2;
			plus += 2;

		}

	}

}
