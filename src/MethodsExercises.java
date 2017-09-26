//import java.util.Scanner;
//
//public class MethodsExercises {
//    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
//        factorial(getInteger(1, 5));
//
////        getInteger(1, 5);  //Hide for factorial example
////        double sumResult = add(1, 2);
////        System.out.println(sumResult);
////        System.out.println("The subtraction answer is " + subtract(2, 4));
////        System.out.println("The multiplication answer is " + multiply(6, 8));
////        System.out.println("The division answer is " + divide(3, 1)); // divide by zero is not allowed
////        System.out.println("The modulus answer is " + modulus(6, 4));
//    } //end of main
//
////    public static double add(double a1, double a2) {
////        return a1 + a2;
////    }
////
////    public static int subtract(int s1, int s2) {
////        return s1 - s2;
////    }
////
////    public static int multiply(int s1, int s2) {
////        return s1 * s2;
////    }
////
////    public static int divide(int s1, int s2) {
////        return s1 / s2;
////    }
////
////    public static int modulus(int s1, int s2) {
////        return s1 % s2;
////    }
//
//    public static int getInteger(int min, int max){
//        Scanner input = new Scanner(System.in);
//        int userInput = input.nextInt();
//        input.nextLine();
//        System.out.print("Enter a number between 1 and 10: ");
//        System.out.println(userInput);
//
//        if (userInput < min || userInput > max){
//            System.out.println("Sorry not valid" + userInput);
//            //Great place to use recursion
//            getInteger(min, max);
//        }else {
//            System.out.println(userInput + " is valid");
//            return userInput;
//        }
//        return 0; //place because using recursion
//    }
//
//
////    public static int factorial(int number) {
////
////        for(int i = 1; i <= number; i++){
//////
////            System.out.println(number *= i "1 = ");
////        }
////        return number;
////    }
////
//}
//
////
////
//
////        ***** Exercise 3 *****
//
////        while(true) {
////            System.out.print("Enter a number between 1 and 10: ");
////            int useNum = Integer.parseInt(input.nextLine());
////            System.out.println(useNum);
////
////            System.out.println("The factorial " + factorial(1));
////
////            System.out.println("Do you want to continue? y/n");
////            String option = input.nextLine();
////
////            if (!option.equalsIgnoreCase("y")) {
////                System.out.println("Ok, good bye");
////                break;
////            }
////
////        }
////
////    }
////
////
//
////}
