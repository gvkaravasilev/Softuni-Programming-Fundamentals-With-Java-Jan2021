package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        StringBuilder wordWithoutRepeatingChars = new StringBuilder();

        for (int i = 0; i < inputText.length() - 1; i++) {
            char currentSymbol = inputText.charAt(i);
            char nextSymbol = inputText.charAt(i + 1);
            if (currentSymbol != nextSymbol) {
                wordWithoutRepeatingChars.append(currentSymbol);
            }
        }
        char lastSymbol = inputText.charAt(inputText.length() - 1);
        wordWithoutRepeatingChars.append(lastSymbol);
        System.out.println(wordWithoutRepeatingChars.toString());
    }
}
