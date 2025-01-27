
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    public Room() {
        persons=new ArrayList<>();
    }
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if(persons.isEmpty())
        return true;
        return false;
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    public Person shortest(){
        if(persons.isEmpty())
        return null;
        int shortest=persons.get(0).getHeight();
        int index=0;
        for (int i = 0; i < persons.size(); i++){
            if(shortest>persons.get(i).getHeight()){
                shortest=persons.get(i).getHeight();
                index=i;
            }
        }
        return persons.get(index);
            
        }
        public Person take(){
            if(persons.isEmpty())
        return null;
        int shortest=persons.get(0).getHeight();
        int index=0;
        for (int i = 0; i < persons.size(); i++){
            if(shortest>persons.get(i).getHeight()){
                shortest=persons.get(i).getHeight();
                index=i;
            }
        }
        return persons.remove(index);
            
        }

        
            
        }
    
