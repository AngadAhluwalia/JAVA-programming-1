public class Cube {
    private  int length;
    private int volume;
    public Cube(int l){
        this.length=l;
        this.volume=this.length*this.length*this.length;
    }
    public int volume(){
        
        return this.volume;
    }
    public String toString(){
        return "The length of the edge is "+this.length+" and the volume "+this.volume;
    }

}
