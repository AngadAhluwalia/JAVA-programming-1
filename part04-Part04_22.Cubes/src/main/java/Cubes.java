
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a=scanner.nextLine();
            if (a.equals("end")) {
                break;
                
            }
            int b=Integer.valueOf(a);
            int c=b*b*b;
            System.out.println(c);
            
        }

    }
}
