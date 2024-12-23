import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<book> books=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String a=scanner.nextLine();
            if (a.isEmpty()) {
                break;
                
            }
            System.out.print("Pages: ");
            int b=Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int c=Integer.valueOf(scanner.nextLine());
            books.add(new book(a,b,c));
        }
        System.out.print("What information will be printed? ");
        String a=scanner.nextLine();
        if(a.equals("everything")){
            for(book info:books){
                System.out.println(info);

            }
        }
        else if (a.equals("name")) {
            for(book info:books){
                System.out.println(info.getName());
            }
            
        }

        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
