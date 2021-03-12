
public class CharOccourence {
	public static void main(String[] args) {

		// declaration
		char[] arr = new char[10];

		for (int i = 0; i < 10; i++) {
			char ch = (char) (Math.random() * (122 - 97) + 97);
			arr[i] = ch; // assigning random char
		}
		

		// counting
		int count;
		for (char c = 'a'; c <= 'z'; c++) {
			count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == c) {
					count++;
				}
			}

			if (count != 0) {
				System.out.printf("%c occurs %d\n",c,count);

				// defining plural word
				if (count > 1) {
					System.out.printf("times");
				} else
					System.out.print("time");
			}

		}

	}

}
