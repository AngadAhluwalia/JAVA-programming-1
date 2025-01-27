
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> data= new ArrayList<Archive>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier=scanner.nextLine();
            if(identifier.isEmpty())
            break;
            System.err.println("Name? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty())
            break;
            
            if(!Archive.containsIdentifier(data, identifier))
            data.add(new Archive(identifier,name));
            

        }
        System.out.println("==Items==");
        for (Archive pair : data) {
            System.out.println(pair);

        }

        



    }
    
}
