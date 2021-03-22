
import java.util.*;

public class SearchByAuthorName {
	public static void main(String[] args) {
		
		System.out.println("How many books?");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		Book[] books = new Book[n];

		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			String author = in.nextLine();
			books[i] = new Book(name, author);
		}
		
		System.out.println("Search by author name:");
		String k = in.nextLine();
		String key = Search(books, k);
		
		System.out.println("Search Results: ");
		for (int i = 0; i < key.length(); i++) {
			System.out.println(books[Integer.parseInt(String.valueOf(key.charAt(i)))].getBookName());
		}
		in.close();
	}

	public static String Search(Book[] books, String author) {
		int count = 0;
		String temp = "";

		for (int i = 0; i < books.length; i++) {
			if (author.equals(books[i].getAuthor())) {
				count++;
				temp += Integer.toString(i);
			}
		}
		System.out.printf("%d books selected | Author: %s\n\n", count, author);

		return temp;
	}

}

class Book {
	private String book_name;
	private String author;

	public Book(String book_name, String author) {
		this.book_name = book_name;
		this.author = author;
	}

	public String getBookName() {
		return book_name;
	}

	public String getAuthor() {
		return author;
	}

	public String toString() {
		return book_name + " " + author;
	}
}