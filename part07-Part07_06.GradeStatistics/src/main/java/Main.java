
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        int sum=0;
        int count=0;
        int passsum=0;
        int passcount=0;
        int[] store={0,0,0,0,0,0};
        while(true){
            String scan=scanner.nextLine();
            int val=Integer.parseInt(scan);
            if(val==-1){
                break;
            }
            if(val>=0&&val<=100){
                if(val>=90)
                store[5]++;
                
                else if(val>=80)
                store[4]++;
                else if(val>=70)
                store[3]++;
                else if(val>=60)
                store[2]++;
                else if(val>=50)
                store[1]++;
                else
                store[0]++;

                if(val>=50){
                    passsum+=val;
                    passcount++;
                    
                }
               sum+=val;
               count++;
            }
        }
        System.out.println("Point average (all): "+(double)sum/count);
        System.out.println("Point average (passing): "+ (passcount==0 ? "-" : (double)passsum/passcount));
        System.out.println("Pass percentage: "+ 100*(double)passcount/count);
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print(i+": ");
            for(int j=0;j<store[i];j++){
                System.out.print("*");

            }
            System.out.println();
        }
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
