public class Book {
    private String author;
    private String title;
    private int pages;
    public Book(String a,String title,int pages){
        this.author=a;
        this.title=title;
        this.pages=pages;

    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString(){
        return this.author+", "+this.title+", "+this.pages+" pages";
    }

}
