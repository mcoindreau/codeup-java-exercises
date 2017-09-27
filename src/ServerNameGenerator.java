import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "agreeable",
            "brave",
            "calm",
            "delightful",
            "eager",
            "faithful",
            "gentle",
            "happy",
            "cheerful",
            "elated"
            };

    private static String[] nouns = {
            "bunny",
            "tiger",
            "frog",
            "goldfish",
            "cow",
            "dog",
            "cat",
            "lion",
            "rabbit",
            "elephant"
    };

    public static void main(String[] args) {
        String genName = getRandArrayElement(adjectives) + "-" + getRandArrayElement(nouns);
        System.out.println("Here is your server name:\n" + genName);
    }

    private static Random rand = new Random();

    public static String getRandArrayElement(String [] wordsArray){
        return wordsArray[rand.nextInt(wordsArray.length)];
    }



    
    

}
