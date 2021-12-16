package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        String asterisks = "";

        for (String bannedWord : bannedWords) {
            if(text.contains(bannedWord)){
                String wordsOfAsterisks = convertWordToStars(bannedWord);
                text = text.replace(bannedWord, wordsOfAsterisks);
            }
        }
        System.out.println(text);
    }

    private static String convertWordToStars(String bannedWord) {
        StringBuilder wordOfStars = new StringBuilder();
        for (int i = 0; i < bannedWord.length(); i++) {
            wordOfStars.append("*");
        }
        return wordOfStars.toString();
    }
}
