import java.util.Scanner;
import java.util.Random;
public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
	int computer = rand.nextInt(3)+0;
        
        System.out.print("scissor (0), rock (1), paper (2): ");
        int play = input.nextInt();
        
        if(computer==0){
            switch(play){
                case 0:
                    System.out.println("The computer is scissor. You are scissor too. It is a draw");
                    break;
                case 1:
                    System.out.println("The computer is scissor. You are rock. You won");
                    break;
                case 2:
                    System.out.println("The computer is scissor. You are paper. You lose");
                    break;
                default:
                    System.out.println("wrong play!");
                    break;
            }  
        }else if(computer==1){
            switch(play){
                case 0:
                    System.out.println("The computer is rock. You are scissor. You lose");
                    break;
                case 1:
                    System.out.println("The computer is rock. You are rock too. It is a draw");
                    break;
                case 2:
                    System.out.println("The computer is rock. You are paper. You won");
                    break;
                default:
                    System.out.println("wrong play!");
                    break;
            }
        }else if(computer==2){
            switch(play){
                case 0:
                    System.out.println("The computer is paper. You are scissor. You won");
                    break;
                case 1:
                    System.out.println("The computer is paper. You are rock. You lose");
                    break;
                case 2:
                    System.out.println("The computer is paper. You are paper too. It is a draw");
                    break;
                default:
                    System.out.println("wrong play!");
                    break;
            }
        }
        
    }
}
