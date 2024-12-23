
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest=0;
        while (true) {
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }
            String[] b=a.split(",");
            
            if (greatest<Integer.valueOf(b[1])) {
                greatest=Integer.valueOf(b[1]);
                
            }
           
        }
        System.out.println("Age of the oldest: "+greatest);


    }
}
