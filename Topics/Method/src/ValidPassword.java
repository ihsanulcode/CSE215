
import java.util.Scanner;

public class ValidPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //mentioned
        System.out.println();
        System.out.println("Password should not contain any space.");
        System.out.println("Password should contain at least one digit(0-9).");
        System.out.println("Password length should be between 8 to 15 characters.");
        System.out.println("Password should contain at least one lowercase letter(a-z).");
        System.out.println("Password should contain at least one uppercase letter(A-Z).");
        System.out.println("Password should contain at least one special character ( @, #, %, &, !, $, etc….).");
        System.out.println();

        String pass;
        
        do {
            //getting password
            System.out.print("Enter your password: ");
            pass = input.nextLine();
            
            if (isValid(pass)) {
                System.out.println("Valid Password.");
            }else{
                System.out.println("Invalid Password!");
            }
        } while (isValid(pass) == false);

    }

    public static boolean isValid(String password) {

        //check space
        if (password.contains(" ")) {
            return false;
        }

        //check length
        if (!(password.length() >= 8 && password.length() <= 15)) {
            return false;
        }

        //check digits
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str = Integer.toString(i);
                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        //check special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }

        //check upper letter
        if (true) {
            int flag = 0;
            for (int i = 65; i <= 90; i++) {

                char ch = (char) i;
                String str = Character.toString(ch);

                if (password.contains(str)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                return false;
            }
        }

        //check lower letter
        if (true) {
            int flag = 0;
            for (int i = 97; i <= 122; i++) {

                char ch = (char) i;
                String str = Character.toString(ch);

                if (password.contains(str)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                return false;
            }
        }

        //when all conditions fails
        return true;
    }
}
