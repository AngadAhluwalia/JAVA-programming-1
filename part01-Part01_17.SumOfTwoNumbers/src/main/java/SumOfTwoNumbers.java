
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int a=Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int b=Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (a + b));

        // Write your program here

    }
}
