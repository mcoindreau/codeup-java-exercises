package sample;

public class java_syntax {

    public static void main(String[] args) {
        int myFavoriteNumber = 7;
        System.out.println("My favorite number is " + myFavoriteNumber);

//        String myString = "Welcome to Mari's world";
//        char myString = "W"; //Error: String cannot convert to char
//        String myString = 3.14159; //Error: double can't be converted to StringString myString = "Welcome to Mari's world";
//          long myNumber = ; //illegal start of expression
//          long myNumber = 123L;
//          long myNumber = 123;
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//         float myNumber = 3.14f;

//        System.out.println(myString);
//        System.out.println(myNumber);

//        Code block runs

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        var class = ;

//        int x = 4;
//        x = x += 5; shorter version x += 5;
//        System.out.println(x);

//        get rid of int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;

//        shorter
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

    }

}

