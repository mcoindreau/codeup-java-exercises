//import java.util.Scanner;
//
//public class controlStructures {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("5" == 5);
//        System.out.println(3 == 5);
//        System.out.println(3.5 >= 5);
//
//        float number = 4.3f;
//        int integerNumber = 4;
//
//        //Java will choose
//        System.out.println(number > integerNumber);
//        System.out.println(number == integerNumber);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int aNumber = input.nextInt();
//
//        if (aNumber % 2 == 0) { // must be boolean or will get error
//            System.out.println(aNumber + "is even");
//        } else {
//            System.out.println(aNumber + "is odd");
//        }
//              Exercises
//     ********* Loop Basics **********
//     **** 1A - While ****
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//     **** 1B - Do While ****
//        int j = 2;
//
//        do {
//            System.out.println(j);
//            j+=2;
//        } while( j <= 100); {
//
//        }
//
//        for (int num = 0; num <= 100; num++){
//            if(num % 2 == 0){
//                int numTwo = num * 2;
//                System.out.println("num = " + num);
//            }
//        }

//        for (int num = 100; num >= -10; num--){
//            if(num % 5 == 0){
////                int numTwo = num * 2;
//                System.out.println("num = " + num);
//            }
//        }
//          **** 1B.3 - Do While ****
        //        long num = 2;
        //
        //        do {
        //            System.out.println("num = " + num);
        //            num *= num;
        //        } while( num <= 1000000);
//
//          **** 1B.3 - For Loop ****
//            for (long num = 2; num < 1000000; num *= num){
//                System.out.println("num = " + num);
//            }

        //********* FIZZBUZZ ********* Important interview question
//      **** 2A ****
//        for (int num = 0; num <= 100; num++){
//            System.out.println("num = " + num);
//        }

//      **** 2B-D ****
//        for (int num = 1; num <= 100; num++){
//            if (num % 5 == 0 && num % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(num % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(num);
//            }
//        }

//        **** 3A **** NOT WORKING

//        while (true) {
//
//            System.out.println("What number would you like to go up to?");
//            int userInt = scan.nextInt();
//
//            System.out.println("number | squared | cubed \n" + "------ | ------- | -----");
//
//            for (int j = 1; j <= userInt; j++) {
//                System.out.printf("%-7s | ", j);
//                System.out.printf("%-8s | ", (j * j));
//                System.out.printf("%-5s", (j * j * j));
//                System.out.println();
//            }
//            System.out.println("Do you want to continue? y/n");
//            String option = scan.nextLine();
//
//            if (!option.equalsIgnoreCase("y")) { //if option is not Y, break it
//                System.out.println("Ok, buhbye");
//                break;
//            }
//        }

//        while (true) {

//            System.out.println("Give me your grade");
//            int grade = scan.nextInt();
//            scan.nextInt();

//            if (grade <=)
//            System.out.println("number | squared | cubed \n" + "------ | ------- | -----");
//
//            for (int j = 1; j <= userInt; j++) {
//                System.out.printf("%-7s | ", j);
//                System.out.printf("%-8s | ", (j * j));
//                System.out.printf("%-5s", (j * j * j));
//                System.out.println();
//            }
//            System.out.println("Do you want to continue? y/n");
//            String option = scan.nextLine();
//
//            if (!option.equalsIgnoreCase("y")) { //if option is not Y, break it
//                System.out.println("Ok, buhbye");
//                break;
//            }
//        }





//    }
//}


