public class Counter {
    private int no;
    public Counter(int startValue){
        this.no=startValue;
     }
     public Counter(){
        this.no=0;
     }
     public int value(){
        return this.no;
     }
     public void increase(){
        no++;
     }
     public void decrease(){
        no--;
     }
     public void increase(int increaseBy){
        if(increaseBy>=0)
        this.no=this.no+increaseBy;

     }
     public void decrease(int decreaseBy){
        if(decreaseBy>=0)
        this.no=this.no-decreaseBy;

     }


}
