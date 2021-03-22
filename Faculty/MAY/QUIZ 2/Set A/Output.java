package QUIZ2;

class test {
	int a;
	int b;
	
	test(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public void meth(test obj) {
		int tempA = this.a;
		int tempB = this.b;
		this.a = tempB;
		this.b = tempA;
		
	}
}

public class Output {
	
	public static void main(String args[]) {
		
		test obj = new test(10, 20);
		obj.meth(obj);
		System.out.println(obj.a + " " + obj.b);
		
	}
}