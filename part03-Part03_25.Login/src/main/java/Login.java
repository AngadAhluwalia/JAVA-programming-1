
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username1="alex";
        String password1="sunshine";
        String username2="emma";
        String password2="haskell";
        System.out.println("Enter username: ");
        String a=scanner.nextLine();
        System.out.println("Enter password: ");
        String b=scanner.nextLine();
        if (a.equals(username1)) {
            if (b.equals(password1)) {
                System.out.println("You have successfully logged in!");
            }
            
        }
        else if (a.equals(username2)) {
            if (b.equals(password2)) {
                System.out.println("You have successfully logged in!");
            }
        }
        else{
            System.out.println("Incorrect username or password!");
        }

    }
}
