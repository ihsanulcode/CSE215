
public class ArrayLengthUtility {

	public static void main(String[] args) {
		
		int[][] arr = {
					    { 1,2,3,4,5 },
				        { 6,7,8,9,10,1,2,3 },
				        { 11,12,13,14,15 }
					};
		
		System.out.println(arr.length); //row 
		System.out.println(arr[0].length); //col 0 length
		System.out.println(arr[1].length); //col 1 length
		System.out.println(arr[2].length); //col 2 length
		}

}
