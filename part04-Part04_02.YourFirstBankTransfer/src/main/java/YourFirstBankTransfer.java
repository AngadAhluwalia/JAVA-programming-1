
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account mathew=new Account("Matthews account", 1000);
        Account me=new Account("My account", 0);
        mathew.withdrawal(100.00);
        me.deposit(100.0);
        System.out.println(mathew);
        System.out.println(me);
        // Do not touch the code in Account.java
        // write your program here
    }
}
