
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Observation>species=new ArrayList<>();
        while (true) { 
            System.out.print("?");
            String line=scan.nextLine();
            if(line.equals("Quit")){
                break;
            }
            if(line.equals("Add")){
                System.out.print("Name: ");
                String name=scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin=scan.nextLine();
                species.add(new Observation(name, latin));

            }
            if(line.equals("Observation")){
                System.out.print("Bird? ");
                String bird=scan.nextLine();
                for(Observation obs:species){
                    if(obs.getName().equals(bird))
                    obs.observation();
                }
            }
            if(line.equals("All")){
                for(Observation obs:species){
                    System.out.println(obs);
                }
            }
            if(line.equals("One")){
                System.out.print("Bird? ");
                String bird=scan.nextLine();
                for(Observation obs:species){
                    if(obs.getName().equals(bird)){
                        System.out.println(obs);
                    }
                }
            }
        }


    }

}
