import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){
        while (true) { 
            System.out.print("Command: ");
            String wString=scanner.nextLine();
            if(wString.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(wString.equals("add")){
                System.out.print("Word: ");
                String d=scanner.nextLine();
                System.out.print("Translation: ");
                String t=scanner.nextLine();
                dictionary.add(d, t);
                continue;
            }
            if(wString.equals("search")){
                System.out.print("To be translated: ");
                String tString=scanner.nextLine();
                String a=this.dictionary.translate(tString);
                if(a==null){
                    System.out.println("Word "+tString+" was not found");
                }
                else
                System.out.println("Translation: "+a);
                continue;

            }
            System.out.println("Unknown command");
        }
    }
    

}
