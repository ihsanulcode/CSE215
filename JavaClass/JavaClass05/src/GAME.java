import java.util.Scanner;

public class GAME {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Player 2 = USER
		System.out.println("Enter your role: ");
		System.out.println("1 = rock");
		System.out.println("2 = paper");
		System.out.println("3 = scissor");
		int player2 = input.nextInt();
		
		// player 1 = computer
		// 1 = rock
		// 2 = paper
		// 3 = scissor
		// (max-min+1)+min
		int player1 = (int) (Math.random() * (3 - 1 + 1) + 1);
		System.out.println("You are: "+player2);
		System.out.println("Computer is: "+player1);
		
		switch(player2) {
		case 1:
			if(player1==1)
				System.out.println("Match Draw");
			if(player1==2)
				System.out.println("Computer win!");
			if(player1==3)
				System.out.println("You win!");
			break;
		case 2:
			if(player1==1)
				System.out.println("You win!");
			if(player1==2)
				System.out.println("Match Draw");
			if(player1==3)
				System.out.println("Computer win!");
			break;
		case 3:
			if(player1==1)
				System.out.println("Computer win!");
			if(player1==2)
				System.out.println("You win!");
			if(player1==3)
				System.out.println("Match Draw");
			break;
		default:
			System.out.println("Cheating!");
		}

		input.close();
	}

}
