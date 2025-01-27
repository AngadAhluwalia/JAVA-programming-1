
public class Main {

    public static void main(String[] args) {
        // Item book = new Item("Lord of the rings", 2);
        // Item phone = new Item("Nokia 3210", 1);
        // Item brick = new Item("brick", 4);

        // Suitcase suitcase = new Suitcase(10);
        // suitcase.addItem(book);
        // suitcase.addItem(phone);
        // suitcase.addItem(brick);

        // System.out.println("The suitcase contains the following items:");
        // System.out.println(suitcase.printItems());
        // System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
    }
    
    

}
