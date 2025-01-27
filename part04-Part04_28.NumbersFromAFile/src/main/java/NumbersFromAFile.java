
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList <Integer>a=new ArrayList<>();
        try(Scanner scanner2= new Scanner(Paths.get(file))){
            while(scanner2.hasNextLine()){
                int row=Integer.valueOf(scanner2.nextLine());
                a.add(row);
            }

        }catch(Exception e){
            System.out.println("Error"+e);
            return;
        }
        int count=0;
        if(!a.contains(lowerBound)&&!a.contains(upperBound)){
            
            System.out.println("Numbers: "+a.size());
        }else
        for(int i=a.indexOf(lowerBound);i<a.indexOf(upperBound);i++)
        count++;
        System.out.println("Numbers: "+count);
        

    }

}
