import java.util.Random;

public class ServerNameGenerator {
    public static String[] nouns = {"water", "elon", "apple", "musk", "tesla", "lightning", "valentino", "mcqueen", "lad", "grad"};

    public static String[] adjectives = {"happy", "sad", "cheerful", "excited", "capricious", "deleterious", "sullen", "studious", "dapper", "groggy"};

    public static String getRandomWord(String[] words) {
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(words.length);
        return words[randInt];

    }

    public static String[] getNouns() {
        return nouns;
    }

    public static void setNouns(String[] nouns) {
        ServerNameGenerator.nouns = nouns;
    }

    public static String[] getAdjectives() {
        return adjectives;
    }

    public static void setAdjectives(String[] adjectives) {
        ServerNameGenerator.adjectives = adjectives;
    }

    public static void main(String[] args) {

        String noun = getRandomWord(ServerNameGenerator.getNouns());
        String adjective = getRandomWord(ServerNameGenerator.getAdjectives());

        System.out.println("Here is your server name:\n" + adjective + "-" + noun);
    }


}