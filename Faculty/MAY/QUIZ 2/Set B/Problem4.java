package QUIZ2;

public class Problem4 {

}

class Test4{
	int a;
	int b;
	
	Test4(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a = "+a+ " b = "+b);
	}
	
	public static void main(String[] args) {
		Test4 object = new Test4(10,20);
		object.display();
	}
}