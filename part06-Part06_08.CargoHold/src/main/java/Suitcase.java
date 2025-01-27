
    import java.util.ArrayList;

    public class Suitcase {
        private ArrayList<Item> items;
        private int maxWeight;

        public Suitcase(int maxweight) {
            
            items=new ArrayList<>();
            maxWeight=maxweight;
            
        }
        public void addItem(Item item){
            int currentWeight=this.totalWeight();
            if(!(currentWeight+item.getWeight()>maxWeight))
            items.add(item);
        }
        public int totalWeight(){
            int totalw=0;
            for (Item item : items) {
                totalw+=item.getWeight();
                
            }
            return totalw;
            
        }
        public  void  printItems(){
            for(Item a:items){
                System.out.println(a);

            }
            
        
                // if (items.isEmpty()) {
                //     return "No items in the suitcase.";
                // }
            
                // String outputString = "";
                // for (Item a : items) {
                //     outputString += a.getName() + " (" + a.getWeight() + " kg)\n";
                // }
                // return outputString.trim(); 
            }
            public Item heaviestItem(){
                if(items.isEmpty())
                return null;
                Item heavy=items.get(0);
                for (Item item : items) {
                    if(item.getWeight()>heavy.getWeight())
                    heavy=item;
                    
                }
                return heavy;
               
            }
            public int currentWeight(){
                return this.totalWeight();
            }
            
        
        @Override
        public String toString(){
            int totalw=this.totalWeight();
            if(items.isEmpty())
            return "no items (0 kg)";
            if(items.size()==1)
            return "1 item ("+totalw+" kg)";
            return items.size()+" items "+"("+totalw+" kg)";
        }
        

    }
