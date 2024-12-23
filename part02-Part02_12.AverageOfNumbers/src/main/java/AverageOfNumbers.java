
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count=0;
        double sum=0;
        while (true) {
            System.out.println("Give a number:");
            double a=Double.valueOf(scanner.nextLine());
            if (a==0) {
                break;
            }else {
                count=count+1;
                sum=sum+a;     
            }
        }
        System.out.println("Average of the numbers: "+(sum/count));


    }
}
