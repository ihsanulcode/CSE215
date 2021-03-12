import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,4,5};
		
		int index = 1;
		
		int i;
		for (i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
