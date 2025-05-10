
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0;
        int container2=0;


        while (true) {
            System.out.println("First: "+container1+"/100");
            System.out.println("Second: "+container2+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts=input.split(" ");
            String command=parts[0];
            int val=Integer.parseInt(parts[1]);
            if(command.equals("add")){
                if(val>0){
                    container1+=val;
                }
                if(container1>100){
                    container1=100;
                }

            }
            if(command.equals("move")){
                if(val>0){
                    if(val>container1){
                        val=container1;
                    }
                    container1-=val;
                    container2+=val;
                    if(container2>100){
                        container2=100;
                    }
                }                
            }
            if(command.equals("remove")){
                if(val>0){
                    if(val>container2){
                        val=container2;
                    }
                    container2-=val;
                }
            }
            

        }
    }

}
