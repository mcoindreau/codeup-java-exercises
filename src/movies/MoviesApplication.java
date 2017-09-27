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

        int catChoice = input.getInt(0, 5);

        if (catChoice == 0) {
            System.out.println(" Goodbye ");

        } else if (catChoice == 1) {
            Movie[] allMovies = MoviesArray.findAll();

            for (Movie movie : allMovies) {
                System.out.println(movie.getName());
            }

        } else if (catChoice == 2) {
            Movie[] allMovies = MoviesArray.findAll();

            for (Movie movie : allMovies) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName());
                }
            }

        }
          else if (catChoice == 3) {
            Movie[] allMovies = MoviesArray.findAll();

            for (Movie movie : allMovies) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName());
                }
            }

        } else if (catChoice == 4) {
            Movie[] allMovies = MoviesArray.findAll();

            for (Movie movie : allMovies) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName());
                }
            }

        } else if (catChoice == 5) {
            Movie[] allMovies = MoviesArray.findAll();

            for (Movie movie : allMovies) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName());
                }
            }
        }
    }
}




