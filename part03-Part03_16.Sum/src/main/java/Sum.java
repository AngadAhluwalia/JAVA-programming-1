
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        int result=sum(numbers);
        System.out.println(result);
        
        
        
        // Try your method here
    }
    public static int sum(ArrayList<Integer> numbers){
        int a=0;
        for(int value:numbers){
            a=a+value;
                
        }
        return a;

    }

}
