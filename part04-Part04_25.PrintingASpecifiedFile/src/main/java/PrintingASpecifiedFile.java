
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String a=scanner.nextLine();
        try(Scanner scanner2=new Scanner(Paths.get(a))){
            while (scanner2.hasNextLine()) {
                String row=scanner2.nextLine();
                System.out.println(row);
                
                
            }
            Double.parseDouble(a);

                
            


        }
        catch(Exception e){
            System.out.println("error");
        }

    }
}
