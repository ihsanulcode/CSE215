
public class Solve04 {

	public static void main(String[] args) {
		// Array declaration
		double[] arr = new double[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double) (Math.random() * (5 - 1 + 1) + 1);
		}
		
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		double[] a = lastPart(arr,3);
		System.out.println("Output Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}
	
	public static double[] lastPart(double[] m,int n) {
		double[] arr = new double[n];
		int index = m.length-n;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = m[index];
			index++;
		}return arr;
	}

}
