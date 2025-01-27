import java.util.ArrayList;

public class Archive {

    
     String name;
    String identifier;
    public  Archive(String i,String n){
        this.identifier=i;
        this.name=n;

    }
    public String getName() {
        return name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public static boolean containsIdentifier(ArrayList<Archive>item,String Identifier){
        for(Archive a:item){
            if(a.getIdentifier().equals(Identifier)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return this.identifier+": "+this.name;
    }

    

}
