
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a= Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b= Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int c= Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((1.0*a)+(1.0*b)+(1.0*c))/3);


        // Write your program here

    }
}
