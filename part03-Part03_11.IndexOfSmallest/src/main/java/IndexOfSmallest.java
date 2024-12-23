
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while (true) {
            int a=scanner.nextInt();
            if (a==9999) {
                break;
                
            }
            list.add(a);
        }
        int smallest=list.get(0);
        for(int i=0;i<list.size();i++){
            int no=list.get(i);
            if (smallest>no) {
                smallest=no;
            }
            
        }
        System.out.println("Smallest number: "+smallest);
        for(int i=0;i<list.size();i++){
            if (list.get(i)==smallest) {
                System.out.println("Found at index: "+i);
            }
            else{
                continue;
            }
            
        }

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
