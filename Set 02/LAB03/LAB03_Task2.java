/* Print the following
 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */
public class LAB03_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
