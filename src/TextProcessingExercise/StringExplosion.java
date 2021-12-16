package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char currentSymbol = inputText.charAt(i);
            char nextSymbol = inputText.charAt(i + 1);
            if(currentSymbol == '>' && Character.isDigit(nextSymbol)){
                int currentIndex = inputText.indexOf(currentSymbol);
                int nextIndex = inputText.indexOf(nextSymbol);
                newText.append(inputText.substring(0, i + 1));
                newText.append(inputText.substring(currentIndex, nextIndex));
            }

        }
    }

}
