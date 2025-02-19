

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    public boolean equals (Object compared){
        if(this==compared)
        return true;
        if(!(compared instanceof Person))
        return false;
        Person comparePerson= (Person)compared;
       
        if(this.name.equals(comparePerson.name)&&this.birthday.getDay()==comparePerson.birthday.getDay()&&this.birthday.getMonth()==comparePerson.birthday.getMonth()&&this.birthday.getYear()==comparePerson.birthday.getYear()&&this.weight==comparePerson.weight&&this.height==comparePerson.height)
        return true;
        return false;

    }

    // implement an equals method here for checking the equality of objects
}
