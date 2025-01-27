
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String a=scanner.nextLine();
        try(Scanner scanner2=new  Scanner(Paths.get(a))){
            while(scanner2.hasNextLine()){
                String row=scanner2.nextLine();
                String[]lines=row.split(","); 
                String name=lines[0];
                int age=Integer.valueOf(lines[1]);      
                if(age==1)
                System.out.println(name+", age: "+age+" year");
                else
                System.out.println(name+", age: "+age+" years");
            }

        }catch(Exception e){
            System.out.println("error");

        }

    }
}
