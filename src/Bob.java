import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter message");
            String name = input.nextLine();
            String lastQuestion = "?";
            String lastYell = "!";

            if (name.endsWith(lastQuestion)) {
                System.out.println("Sure.");
            } else if (name.endsWith("!") || name.equals(name.toUpperCase()) && !name.isEmpty()){
                System.out.println("Whoa, chill out!");
            } else if (name.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Do you want to continue? y/n");
            String option = input.nextLine();

            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Ok, good bye");
                break;
            }
        }
    }

}
