
public class PaymentCard {

    private double balance=1000;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance =this.balance+ increase;
    }

    public boolean takeMoney(double amount) {
        if(this.balance>=amount){
            this.balance=balance-amount;
            return true;
        }
        
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
    }
}
