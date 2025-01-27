
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    @Override
    public String toString(){
        if(elements.isEmpty())
        return "The collection "+this.name+" is empty.";
        String print="The collection "+this.name+" has "+elements.size()+" element:\n";
        String print1="The collection "+this.name+" has "+elements.size()+" elements:\n";
        String peopleonride="";
        if(elements.size()==1){
            peopleonride=peopleonride+elements.getFirst();
        }else{
            for(String a:elements){
                peopleonride=peopleonride+a+"\n";
    
            }

        }     
        if(elements.size()==1)
        return print+peopleonride;
        return print1+peopleonride;
    }
    
}


