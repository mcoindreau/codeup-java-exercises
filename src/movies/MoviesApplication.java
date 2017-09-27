package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        do {

            System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "Enter your choice:\n");

        int catChoice = input.getInt(0, 5);

            if (catChoice == 0) {
                System.out.println(" Goodbye ");
                break;
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

            } else if (catChoice == 3) {
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

            System.out.println("Would you like to continue? y/n");

        } while (input.yesNo(""));

        System.out.println("Goodbye.");
    }
}