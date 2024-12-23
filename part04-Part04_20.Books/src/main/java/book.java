
public class book {
    private String name;
    private int pages;
    private int year;
    public book(String a,int b,int c){
        this.name=a;
        this.pages=b;
        this.year=c;
    }
    
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name+", "+this.pages+" pages, "+this.year;
    }

}
