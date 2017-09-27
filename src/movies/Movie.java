package movies;

public class Movie {

   private String name;
   private String categories;

    public Movie (String name, String categories){
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return categories;
    }

    public int nextLine() {
        return 0;
    }
}
