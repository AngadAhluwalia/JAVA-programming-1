
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        int newEuros=this.euros+addition.euros;
        int neewCents=this.cents+addition.cents;
        if(neewCents>=100){
            neewCents=neewCents-100;
            newEuros++;
        }
        return new Money(newEuros,neewCents);
    }
    public boolean lessThan(Money compared){
        if(this.euros<compared.euros||(this.euros==compared.euros&&this.cents<compared.cents))
        return true;

        return false;
    }
    public Money minus(Money decreaser){
        int totalCents=this.euros*100+this.cents;
        int decreaserCents=decreaser.euros*100+decreaser.cents;
        if(totalCents-decreaserCents<0)
        return new Money(0,00);
        int total=totalCents-decreaserCents;
        int newEuros=total/100;
        int neewCents=total%100;
        return new Money(newEuros, neewCents);
    }


}
