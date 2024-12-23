import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String a=scanner.nextLine();
            if(a.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int b=scanner.nextInt();
            scanner.nextLine();
            programs.add(new TelevisionProgram(a, b));
            
        }
        System.out.println("Program's maximum duration? ");
        int c=scanner.nextInt();
        for(TelevisionProgram info:programs){
            if (info.getDuration()<=c) {
                System.out.println(info);
                
            }
        }

    }
}
