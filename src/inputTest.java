import util.Input;

public class inputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter number");
        int number = input.getInt(1, 10);

        System.out.println("You chose" + number);

    }
}
