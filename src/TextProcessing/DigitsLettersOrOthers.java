package TextProcessing;

import java.util.Scanner;

public class DigitsLettersOrOthers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char currentSymbol = inputText.charAt(i);

            if(Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if(Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);
            }else{
                others.append(currentSymbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.print(others.toString());
    }
}
