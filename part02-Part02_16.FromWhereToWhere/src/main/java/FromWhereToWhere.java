
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int a=Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int b=Integer.valueOf(scanner.nextLine());
        for(int i=b;i<a+1;i++){
            System.out.println(i);
        }

        // Write your program here
    }
}
