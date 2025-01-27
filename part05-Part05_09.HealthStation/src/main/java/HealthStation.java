
public class HealthStation {
    private int count=0;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight(); 
        
    }
    public void feed(Person person){
        int a=person.getWeight();
        a=a+1;
        person.setWeight(a);
    }
    public int weighings(){
        return this.count;

    }

}
