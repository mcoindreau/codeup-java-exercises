package util;
import java.util.Scanner;


public class Input {
    private Scanner scanner;
    private int getInt2;

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString("Here's the getString question?"));
        System.out.println(input.yesNo("Is Terrell mean?"));
//        System.out.println(input.getInt(2, 10));
//          System.out.println(input.getInt2);
//        System.out.println(input.getDouble(1, 20));


    }//end main

    public Input(){
        this.scanner = new Scanner(System.in);
    }

//    public String getString(String question) {
//        System.out.println(question);
//        String answer = scanner.nextLine();
//        return answer;
//    }
//
    public boolean yesNo(String tMean){
        System.out.println(tMean);
        tMean = this.scanner.nextLine();

        if (tMean.equals ("y") || tMean.equals("yes")){
            System.out.println("Preach");
            return true;
        }else {
            return false;
        }
    }

//    public int getInt(int min, int max){
//        System.out.println("Give me a number between " ); //+ getInt
//        int intMinMax = Integer.parseInt(scanner.nextLine());
//
//        if(intMinMax < min || intMinMax > max){
//            System.out.println("Outside limit");
//           intMinMax = getInt(min, max);
//        }else {
//            System.out.println("You're good!");
//            return intMinMax;
//        }
//        return intMinMax;
//    }

//    not working
//    public int getInt2(){
//        System.out.println("Please enter a number" );
//        int inputNum2 = Integer.parseInt(scanner.nextLine());
//        System.out.println("Your number is "+ inputNum2);
//        return inputNum2;
//
//    }
//
//    public double getDouble (double min, double max){
//        System.out.println("Give me a double number between");
//        double dIntMinMax = Integer.parseInt(scanner.nextLine());
//
//        if(dIntMinMax < min || dIntMinMax > max) {
//            System.out.println("Double outside");
//            dIntMinMax = getDouble(min, max);
//        }else{
//            System.out.println("Double good");
//            return dIntMinMax;
//        }
//        return dIntMinMax;
//    }
//
//    public double getDouble(){
//
//    }










}//end class Input
