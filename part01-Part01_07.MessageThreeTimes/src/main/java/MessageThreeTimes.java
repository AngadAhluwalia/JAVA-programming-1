
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        
        String m=scanner.nextLine();

        System.out.println(m);
        System.out.println(m);
        System.out.println(m);

    }
}
