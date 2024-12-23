
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldest="";
        int greatest=0;
        while (true) {
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }
            String[] b=a.split(",");
            if (greatest<Integer.parseInt(b[1])) {
                greatest=Integer.parseInt(b[1]);
                oldest=b[0];
            }
        }
        System.out.println("Name of the oldest: "+oldest);


    }
}
