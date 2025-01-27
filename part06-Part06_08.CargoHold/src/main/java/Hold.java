
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase>holding;
    public Hold(int weight){
        holding=new ArrayList<>();
        maxWeight=weight;
    }
    public void addSuitcase(Suitcase suitcase){
        int currentWeight=0;
        for (Suitcase sir : holding) {
            currentWeight+=sir.totalWeight();
            
            
        }
        if(currentWeight+suitcase.totalWeight()<=maxWeight){
            holding.add(suitcase);
        }

    }
    public void printItems(){
        for (Suitcase sir : holding){
            sir.printItems();

        }
    }
    public String toString(){
        int tot=0;
        for (Suitcase sir : holding) {
            tot+=sir.totalWeight();

    }
    return holding.size()+" suitcases ("+tot+" kg)";

    // public int totalWeight(){
    //     int totalw=0;
    //     for (Suitcase item : holding) {
    //         totalw+=i;
            
    //     }
    //     return totalw;
        
}

}
