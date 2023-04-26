package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name){
        this(name,"no category");
    }
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String getTitle(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public void setTitle(String name){
        this.name = name;
    }
    public void setCategory(String cat){
        this.category = cat;
    }
}
