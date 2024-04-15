
import java.util.Scanner;
public class kullanıcı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "nehirunalan", password = "yaptim", usernameCheck, passwordCheck ;

        System.out.print("Username: ");
        usernameCheck = scanner.next();
        System.out.print("Password:");
        passwordCheck=scanner.next();

        if ((!password.equals(passwordCheck))) {
            System.out.print("Password is wrong, wanna change the password? (type 'yes' or 'no'): ");
            String choice = scanner.next();
            if(choice.equals("yes")) {
                System.out.print("New password: ");
                passwordCheck = scanner.next();
                if(password.equals(passwordCheck)) {
                    System.out.print("Couldn't generate the password. Please try again");
                } else {
                    System.out.print("Password generated. Have a great day!");
                }
            }
        } else {
            System.out.print("Password: ");
            passwordCheck = scanner.next();
            if (password.equals(passwordCheck)) {
                System.out.println("Logged in successfully!");
            } else {
                System.out.println("Password is wrong. Please try again");
            }
        }
    }
}


