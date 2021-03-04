import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MyBook book = new MyBook();
		String title = input.nextLine();
		book.setTitle(title);
		System.out.println("The title is: "+book.getTitle());
		
		input.close();

	}

}

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String s) {
		title = s;
	}
}