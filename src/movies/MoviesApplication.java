package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();


        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("Enter your choice:");
//        int chat option = input.nextLine();
//        System.out.println("You entered " + option);

        int catChoice = input.getInt(0, 5);

        if (catChoice == 0) {
            System.out.println(" Goodbye ");
        } else if (catChoice == 1) {
            Movie[] allMovies = MoviesArray.findAll();
            for (Movie movie : allMovies) {
                System.out.println(movie.getName());
            }else if (catChoice == 2) {
                Movie[] allMovies = MoviesArray.findAll();
                for(Movie)
            }
//      else if (cat == 3) {
//            catChoice = "drama";
//        } else if (cat == 4) {
//            catChoice = "horror";
//        } else if (cat == 5) {
//            catChoice = "scifi";
//        }
//        else {
//            catChoice = 0;
        }
//        System.out.println("You've selected category number: " + cat);
    }
}








//}
