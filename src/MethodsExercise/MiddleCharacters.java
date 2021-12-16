package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        middleChar(text);
    }

    public static void middleChar(String text) {
        if (text.length() % 2 == 0) {
            char firstSymbol = text.charAt(text.length() / 2 - 1);
            char secondSymbol = text.charAt(text.length() / 2);
            System.out.printf("%c%c",firstSymbol,secondSymbol);
        }else{
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
