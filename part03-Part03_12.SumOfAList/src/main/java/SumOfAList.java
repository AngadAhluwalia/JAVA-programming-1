
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int n=0;
        for(int i=0;i<list.size();i++){
            int a=list.get(i);
            n+=a;
        }

        System.out.println("Sum: " + n);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
