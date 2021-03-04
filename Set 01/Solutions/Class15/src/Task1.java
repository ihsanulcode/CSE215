
public class Task1 {

	public static void main(String[] args) {
		
		MyCalculator c = new MyCalculator();
		System.out.println(c.divisor_sum(6));
	}

}

class MyCalculator implements AdvancedArithmetic{
	
	MyCalculator(){
		System.out.println("I implemented: AdvancedArithmetic");
	}
	
	public int divisor_sum(int n) {
		int sum = 0;
		
		for (int i=1;i<=n;i++) 
            if (n%i==0) 
                sum += i; 
		
		return sum;
	}
}
