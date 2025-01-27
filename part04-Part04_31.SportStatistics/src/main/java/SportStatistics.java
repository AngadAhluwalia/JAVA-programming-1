
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("file:");
        String file=scan.nextLine();
       
        


    }
    public static ArrayList<String> readRecords(String file){
        ArrayList<String> teams=new ArrayList<>();
        try(Scanner scanner=new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()) {
                String row=scanner.nextLine();
                teams.add(row);
            }

        }catch(Exception e){
            System.out.println("error");
        }
        return null;

    }

}
