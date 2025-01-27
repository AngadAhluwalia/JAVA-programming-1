
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if(this.rooms>compared.rooms)
        return true;
        if(this.rooms<compared.rooms)
        return false;
        if(this.squares>compared.squares)
        return true;
        if(this.squares<compared.squares)
        return false;
        return false;
    }
    public int priceDifference(Apartment compared){
        int currentPrice=this.squares*this.princePerSquare;
        int comparedPrice=compared.squares*compared.princePerSquare;
        if(currentPrice>comparedPrice)
        return currentPrice-comparedPrice;
        if(comparedPrice>currentPrice)
        return comparedPrice-currentPrice;
        return 0;
    }
    public boolean moreExpensiveThan(Apartment compared){
        int currentPrice=this.squares*this.princePerSquare;
        int comparedPrice=compared.squares*compared.princePerSquare;
        if(comparedPrice<currentPrice)
        return true;
        return false;
    }

}
