public class Timer {
    int hundredths;
    int seconds;
    public Timer(){
        this.hundredths=0;
        this.seconds=0;
        


    }
    public void advance(){
        this.hundredths++;
        if(this.hundredths==100){
            this.hundredths=0;
            this.seconds++;
        }
        if(this.seconds==60)
        this.seconds=0;
    }
   
    public String toString(){
        if(this.seconds<10&&this.hundredths<10)
        return "0"+this.seconds+":0"+this.hundredths;
        if(this.hundredths<10&&!(this.seconds<10))
        return this.seconds+":0"+this.hundredths;
        if(this.seconds<10&&!(this.hundredths<10))
        return "0"+this.seconds+":"+this.hundredths;
        return this.seconds+":"+this.hundredths;
    }

}
