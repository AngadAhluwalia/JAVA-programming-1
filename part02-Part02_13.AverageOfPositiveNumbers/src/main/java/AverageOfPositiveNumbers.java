
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count=0;
        double sum=0;
        while (true) {
            System.out.println("Give a number:");
            double a=Double.valueOf(scanner.nextLine());
            if (a==0) {
                System.out.println("Cannot calculate the average");
                break;
            }else if (a>0) {
                count=count+1;
                sum=sum+a;
            }else{
                System.out.println("Cannot calculate the average");
            }
    }
    System.out.println("Average of the numbers: "+(sum/count));
}


    }

