package QUIZ2;

public class Problem1 {

}

class Testt{
	public static void main(String[] args) {
		System.out.println(fun());
	}
	static int fun() {
		int x = 0;
		return ++x;
	}
}

/*

Here inside the fun() static method the int type variable can't be static type 
This can be final only. We can correct the code by removing the static keyword from x.
*/
