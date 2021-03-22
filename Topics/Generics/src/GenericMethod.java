
public class GenericMethod {

	public static <E> void printArray(E[] e) {
		for (E i : e) {
			System.out.println(i);
		}System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] n = {1,2,3,4,5};
		printArray(n);
		
	}

}
