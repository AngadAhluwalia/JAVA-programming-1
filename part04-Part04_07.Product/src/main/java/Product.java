public class Product {
    private double price;
    private int qty;
    private String name;
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.price=initialPrice;
        this.qty=initialQuantity;
        this.name=initialName;
    }
    public void printProduct(){
        System.out.println(this.name+", price "+this.price+", "+this.qty+" pcs");
    }

}
