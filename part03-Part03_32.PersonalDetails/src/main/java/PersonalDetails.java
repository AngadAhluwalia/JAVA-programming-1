
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest="";
        int sum=0;
        int number=0;
        int length=0;
        while (true) {
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }
            String [] b=a.split(",");
            int c=b[0].length();
            if (length<c) {
                longest=b[0];
                length=c;
                
            }
            sum=sum+Integer.valueOf(b[1]);
            number++;
        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+((double)sum/(double)number));


    }
}
