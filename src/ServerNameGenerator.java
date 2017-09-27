import java.util.Random;

public class ServerNameGenerator {

//    String list means array

    public static String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "cheerful", "elated" };

    public static String[] nouns = {"bunny", "tiger", "frog", "goldfish", "cow", "dog", "cat", "lion", "rabbit", "elephant"};

    public static void main(String[] args) { //create main method
        String genName = getRandArrayElement(adjectives) + "-" + getRandArrayElement(nouns);
        System.out.println("Here is your server name:\n" + genName);
    }
    public static Random rand = new Random();

    //    create method as static because won't change *** must call in Main method
    public static String getRandArrayElement(String [] wordsArray){
//        return wordsArray[rand.nextInt(wordsArray.length)];

        int rnd = 0 + (int)(Math.random() * ((nouns.length - 0) + 1));
        int rnd2 = 0 + (int)(Math.random() * ((nouns.length - 0) + 1));

        return nouns[rnd] + "-" + adjectives[rnd2];
    }
//    need return since not using void



    
    

}
