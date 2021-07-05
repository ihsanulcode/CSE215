import java.util.Scanner;

public class TV_Remote {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t<< Samsung TV Remote >>\n");
		System.out.println("(0) Power");
		System.out.println("(1) Button 1");
		System.out.println("(2) Button 2");
		System.out.println("(3) Button 3");
		System.out.println("(4) Button 4");
		System.out.println("(5) Button 5");
		
		System.out.println("(6) Channel Up");
		System.out.println("(7) Channel Down");
		System.out.println("(8) Volume Up");
		System.out.println("(9) Volume Down");
		
		int button = input.nextInt(); //getting input from user
		
		switch(button) {
		case 0:
			System.out.println("User pressed power button");
			break;
		case 1:
			System.out.println("User pressed button 1");
			break;
		case 2:
			System.out.println("User pressed button 2");
			break;
		case 3:
			System.out.println("User pressed button 3");
			break;
		case 4:
			System.out.println("User pressed button 4");
			break;
		case 5:
			System.out.println("User pressed button 5");
			break;
		case 6:
			System.out.println("channel++");
			break;
		case 7:
			System.out.println("channel--");
			break;
		case 8:
			System.out.println("volume++");
			break;
		case 9:
			System.out.println("volume--");
			break;
		default:
			System.out.println("error!");
		}
		
		input.close();
	}

}
