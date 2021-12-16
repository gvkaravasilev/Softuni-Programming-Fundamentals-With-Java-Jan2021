package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputWord = scan.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < inputWord.length(); i++) {
            char currentSymbol = inputWord.charAt(i);
            char encryptedSymbol = (char) (currentSymbol + 3);
            encryptedText.append(encryptedSymbol);
        }
        System.out.println(encryptedText.toString());
    }
}
