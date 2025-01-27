public class Fitbyte {
    private int age;
    private int resting;
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.resting=restingHeartRate;
            
    }
    public double targetHeartRate(double percentageOfMaximum){
        double max=206.3 - (0.711 * age);
        return (((max)-this.resting)*(percentageOfMaximum))+this.resting;
    }


}
