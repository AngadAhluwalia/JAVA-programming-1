
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }
            String [] b=a.split(" ");
            int i=b.length;
            System.out.println(b[i-1]);
        }


    }
}
