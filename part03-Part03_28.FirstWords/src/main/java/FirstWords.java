
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }
            String[] b=a.split(" ");
            System.out.println(b[0]);
        }



    }
}
