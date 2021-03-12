
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListBasic {

	public static void main(String[] args) {
		
		//declaration
		ArrayList<Integer> arr = new ArrayList<Integer>();

		//adding elements
		arr.add(4);
		arr.add(2);
		arr.add(5);
		arr.add(1);
		arr.add(3);
		
		//printing
		System.out.println(arr);
		
		//sort
		Collections.sort(arr);
		System.out.println(arr);
		
		//removing
		arr.remove(4);
		
		//adding
		arr.add(10);
		
		//for-each printing
		System.out.println("For-each loop:");
		for(int i: arr) {
			System.out.println(i);
		}
		
		//Iterator
		System.out.println("Iterator:");
		Iterator itr = arr.iterator(); //getting Iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
