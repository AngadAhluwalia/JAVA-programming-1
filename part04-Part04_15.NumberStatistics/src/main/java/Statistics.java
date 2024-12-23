
public class Statistics {
    private int count;
    private int sum;
    public Statistics(){
        this.count=0;
        this.sum=0;
       }
       public void addNumber(int a){
        this.count++;
        this.sum=this.sum+a;
       }
       public int getCount(){
        return this.count;
       }
       public int sum(){
        return this.sum;
       }
       public double average(){
        double avg=0.0;
        avg=(double)this.sum/this.count;
        return avg;
       }
       
}
