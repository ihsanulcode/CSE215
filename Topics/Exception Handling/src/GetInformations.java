public class GetInformations {

	public static void main(String[] args) {
		try {
			System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());

			System.out.println("\nTrace info from getStackTrace:");
			StackTraceElement[] var = ex.getStackTrace();
			for (int i = 0; i < var.length; i++) {
				System.out.println("Method " + var[i].getMethodName() + "(" + var[i].getClassName() + ": "
						+ var[i].getLineNumber()+")");
			}
		}

	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i <= arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
