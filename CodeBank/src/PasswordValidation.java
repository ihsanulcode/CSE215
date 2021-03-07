
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //mention
        System.out.println("Your password should have at least ten characters.");
        System.out.println("Your password should consists  of only letters and digits.");
        System.out.println("Your password must contain at least three digits.");

        System.out.print("\nEnter password: ");
        String password = input.nextLine();

        //getting password
        if (passchecker(password)) {
            System.out.println("Valid Password.");
        } else {
            System.out.println("Invalid Password!");
        }

    }

    public static boolean passchecker(String password) {
        //check length
        if (!(password.length() >= 10)) {
            return false;
        }

        //check digits
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str = Integer.toString(i);
                if (password.contains(str)) {
                    count++;
                }
            }
            if (!(count >= 3)) {
                return false;
            }
        }

        //consists  of only letters and digits
        if (true) {
            int flag = 0;
            for (int i = 0; i < password.length(); i++) {
                if(Character.isLetterOrDigit(password.charAt(i)) == false){
                    return false;
                }
            }

        }

        //when all conditions fails
        return true;
    }

}
