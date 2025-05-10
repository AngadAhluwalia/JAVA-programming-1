
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        Container container1=new Container();
        Container container2=new Container();


        while (true) {
            System.out.println("First: "+container1.contains()+"/100");
            System.out.println("Second: "+container2.contains()+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts=input.split(" ");
            String command=parts[0];
            int val=Integer.parseInt(parts[1]);
            if(command.equals("add")){
                container1.add(val);

            }
            if(command.equals("move")){
                if(val>0){
                    if(val>container1.contains()){
                        val=container1.contains();
                    }
                    container1.remove(val);
                    container2.add(val);
                    
                }                
            }
            if(command.equals("remove")){
                if(val>0){
                    if(val>container2.contains()){
                        val=container2.contains();
                    }
                   container2.remove(val);
                }
            }
            

        }

}
}
