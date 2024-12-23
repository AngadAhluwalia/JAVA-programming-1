public class Debt {
    private double balance;
    private double intrest;
    public Debt(double initialBalance, double initialInterestRate){
        this.balance=initialBalance;
        this.intrest=initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear(){
        this.balance=this.balance*this.intrest;
        

    }

}
