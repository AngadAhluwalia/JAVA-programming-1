
import java.util.Scanner;

public class UserInterface {
    private TodoList user;
    private Scanner scanner;
    public UserInterface(TodoList users,Scanner sc){
        user=users;
        scanner=sc;
    }
    public void start(){
        
        
        while (true) { 
            System.out.print("Command: ");
            String theString=scanner.nextLine().trim();
            if(theString.equals("stop")){
                break;
            }
            if(theString.equals("add")){
                System.out.print("To add: ");
                String a=scanner.nextLine().trim();
                user.add(a);
                continue;
            }
            if(theString.equals("list"))
            user.print();
            if(theString.equals("remove")){
                System.out.println("Which one is removed? ");
                int b=Integer.parseInt(scanner.nextLine().trim());
                user.remove(b);
            }
            
        }
    }

}
