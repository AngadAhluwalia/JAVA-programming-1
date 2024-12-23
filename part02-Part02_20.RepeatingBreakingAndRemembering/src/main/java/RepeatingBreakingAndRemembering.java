
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum=0;
        int no=0;
        int even=0;
        int odd=0;
        
        while (true) {
            
            double a=Double.valueOf(scanner.nextLine());
            if (a==-1) {
                System.out.println("Thx! Bye!");
                break;
                
            }else if (a%2==0) {
                even=even+1;
                sum+=a;
                no=no+1;
            }else{
                odd=odd+1;
                sum+=a;
                no=no+1;
            }
            
        }
        
        System.out.println("sum: "+sum);
        System.out.println("Numbers: "+no);
        double average=(double) sum/no;
        System.out.println("Average: "+average);
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);
    }
}
