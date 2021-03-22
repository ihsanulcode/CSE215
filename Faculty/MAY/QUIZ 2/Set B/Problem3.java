package QUIZ2;

public class Problem3 {

}

class Demo{
	int value1;
	int value2;
	
	Demo(){
		
	}
	
	Demo(int n){
		this.value1 = n;

	}
	
	Demo(int value1,int value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public void display() {
		System.out.println("Value1 === "+value1);
		System.out.println("Value2 === "+value2);
	}
	
	public static void main(String[] args) {
		Demo d2 = new Demo(30);
		Demo d3 = new Demo(30,40);
		d2.display();
		d3.display();
	}
}