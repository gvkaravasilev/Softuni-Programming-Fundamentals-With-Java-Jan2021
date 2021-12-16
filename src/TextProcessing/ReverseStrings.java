package TextProcessing;

import java.util.Scanner;

public class ReverseStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputWord = scan.nextLine();

        while (!inputWord.equals("end")) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = inputWord.length() - 1; i >= 0; i--) {
                reversedWord.append(inputWord.charAt(i));

                if (reversedWord.toString().length() == inputWord.length()) {
                    System.out.printf("%s = %s%n", inputWord, reversedWord.toString());
                    break;
                }
            }

            inputWord = scan.nextLine();
        }
    }
}
