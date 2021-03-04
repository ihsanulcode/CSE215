import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 3;
		Shape[] s = new Shape[i];
		
		s[0] = new Square("Square",5);
		s[1] = new Rectangle("Rectangle",4,5);
		
		add(s,new Rectangle("New Rectangle",5,5));
		display(s);
		
		System.out.print("\nSearch by Shape name: ");
		String key = input.nextLine();
		search(s,key);
		
		input.close();
	}
	
	static void add(Shape[] shapes,Shape s) {
		shapes[2] = s;
	}
	
	static void search(Shape[] shapes,String n) {
		boolean flag = false;
		int index = -1;
		
		System.out.println("\nSearch Result:\n");
		for (int i = 0; i < shapes.length; i++) {
			if(n.equals(shapes[i].getName())) {
				flag = true;
				index = i;
			}
		}
		if(flag) {
			System.out.println(shapes[index].toString());
		}else {
			System.out.println("Can't found!");
		}
	}
	
	static void display(Shape[] shapes) {
		System.out.println("\n----- Display -----");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println();
			
			System.out.println(shapes[i].toString());
		}
		
	}

}

class Shape{
	private String name;
	
	Shape(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "";
	}
	
	public int area() {
		return 0;
	}
}

class Square extends Shape{
	private int length;
	
	Square(String name,int length){
		super(name);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "Name: "+getName()+"\nLength: "+getLength()+"\nArea: "+area();
	}
	
	public int area() {
		return length*length;
	}
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	Rectangle(String name,int length,int width){
		super(name);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public String toString() {
		return "Name: "+getName()+"\nLength: "+getLength()+"\nWidth: "+getWidth()+"\nArea: "+area();
	}
	
	public int area() {
		return width*length;
	}
}
