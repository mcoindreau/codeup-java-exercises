package movies;

//don't need main method because not calling methods just defining them
public class Movie {

   private String name; //will never be shared since private
   private String categories;

//   need to create getter and setter
//    constructor because a method of same name as class; can be empty constructor
//    create with the minimum amount of info needed
    public Movie (String name, String categories){
        this.name = name;
        this.categories = categories;
    }

    public String getName() { //empty constructor
        return name;
    }

    public String getCategory() {
        return categories;
    }

    public int nextLine() {
        return 0;
    }


}
