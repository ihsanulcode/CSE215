
public class MethodOverloading {

	public static void main(String[] args) {
		
		f1(1,'A');
		f1('B',2);
		f1(1,2,3);

	}
	
	public static void f1(int a,char c) {
		System.out.println("int = "+a+"\nchar = "+c);
	}
	
	public static void f1(char c,int a) {
		System.out.println("char = "+c+"\nint = "+a);
	}
	
	public static void f1(int a,int b,int c) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
