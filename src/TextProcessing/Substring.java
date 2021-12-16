package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String inputWord  = scan.nextLine();

        while(inputWord.contains(wordToRemove)){
            inputWord = removeOccurrences(inputWord, wordToRemove);
        }
        System.out.println(inputWord);
    }

    private static String removeOccurrences(String inputWord, String wordToRemove) {
        int beginIndex = inputWord.indexOf(wordToRemove);
        int endIndex = beginIndex + wordToRemove.length();

        return inputWord.substring(0, beginIndex) + inputWord.substring(endIndex);
    }
}
