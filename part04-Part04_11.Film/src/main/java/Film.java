public class Film {
    private String name;
    private int rating;
    public Film(String filmName, int filmAgeRating){
        this.name=filmName;
        this.rating=filmAgeRating;
    }
    public String name(){
        return this.name;
    }
    public int ageRating(){
        return this.rating;
    }

}
