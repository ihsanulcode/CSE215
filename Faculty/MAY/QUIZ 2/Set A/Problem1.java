package QUIZ2;

public class Problem1 {

	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		return 20;
	}

}


/*
In this problem here inside the main method we are invoking fun() method
But we know that static method can't connect non static methods. 
There main method is static but fun method is non static method
So there it can't be possible to invoke fun() form a static method main.
*/



/*
Static methods can't access non static methods. Here main method is a static method which is trying to
invoke fun method which is non static method. So this is the problem.
We can make the fun method to static type to fix it.
*/