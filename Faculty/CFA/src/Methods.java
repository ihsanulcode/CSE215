
public class Methods {
	
	public void print(int n,char c) {
		System.out.println(n);
		System.out.println(c);
		System.out.println();
	}
	
	public void print(char c,int n) {
		System.out.println(c);
		System.out.println(n);
		System.out.println();
	}
	
	public void sum(int num1,double num2) {
		System.out.println("Sum: "+(num1+num2));
	}
	
	public void sum(int num1,float num2) {
		System.out.println("Sum: "+(num1+num2));
	}

}

class Test{
	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.print(1, 'M');
		obj.print('M', 2);
		obj.sum(5, 2.5);
		obj.sum(5, 5.5);
	}
}
