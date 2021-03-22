package QUIZ2;

public class Calculator {
	int num = 100; //num was 100 at first

	public void calc(int num) {
		this.num = num * 10;  //receive num and then multiplay 10 with it 
		                     //at last assignment the answer into num variable; so the updated value of num is now 20;
	}

	public void printNum() {
		System.out.println(num); //print the num variable's data
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator(); //creating an object of calculator class
		obj.calc(2); //invoking calculator classes method calc() and pass 2 as a parameter
		obj.printNum(); //then call the printNum method to print num variable of the Calculator class
	}
}

/*
1: Declaring an object of Calculator class "obj" and invoke it's no argument constructor using new operator.
2: Then invoking the Calculator class method calc() and sending 2 as it's parameter.
3: Inside the calc() method it takes 2 as a parameter and then multiply with 10 and then assign it into the Calculator classes data num
4: Now the num variable is updated to 20
5: at last invoke the printNum() method to print the class data num.

Output: 20
*/

