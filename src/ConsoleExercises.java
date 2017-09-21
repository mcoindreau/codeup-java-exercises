import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //**** same as **** Luis way
        Scanner input;
        input = new Scanner(System.in); // in JS constructor function, in Java construction
        //**********
//        System.out.println("Please enter your fav integer");
//        int userInt = scan.nextInt(); //throws an error if string inputted
//        //String userInt = scan.nextLine(); // doesn't throw an error with a string
//
//        System.out.println("You favorite integer is " + userInt);
        //accepts strings for the integer

//        Scanner scanThree = new Scanner(System.in); don't need since declared line 5

        System.out.println("Please enter three words");
        String wordOne = scan.next();
        String wordTwo = scan.next();
        String wordThree = scan.next();

        System.out.println(wordOne+"\n");
        System.out.println(wordTwo+"\n");
        System.out.println(wordThree+"\n");

        input.nextLine();

//        Scanner scanSent = new Scanner(System.in);
        System.out.println("Please enter a sentence");
//        String sentence = scan.next(); only captures first word
        String sentence = scan.nextLine();
        System.out.println(sentence);


//        System.out.println("Enter width");
//        int width = scan.nextInt();
//
//        System.out.println("Enter length");
//        int length = scan.nextInt();
//
//        int area = length * width;
//        int perimeter = 2 * length + 2 * width;
//
//        System.out.println("The area is " + area);
//        System.out.println("The perimeter is " + perimeter);

        input.nextLine();

        System.out.println("Enter width");
        double width = Double.parseDouble(scan.nextLine()); //input nextDouble

        System.out.println("Enter length");
        double length = Double.parseDouble(scan.nextLine());

        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);


    }

}
