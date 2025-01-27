
import java.util.ArrayList;

public class Stack {
    ArrayList<String>stack;

    public Stack() {
        stack=new ArrayList<>();
       

    }
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        return false;

    }
    public void add(String value){
        stack.add(value);
    }
    public ArrayList<String> values(){
        return stack;
    }
    public String take(){
        return stack.remove(stack.size()-1);
    }

}
