package MethodsExercise;

import java.util.Scanner;

public class CharInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        printCharInRange(firstSymbol, secondSymbol);

    }

    public static void printCharInRange(char startSymbol, char endSymbol) {
        if (startSymbol < endSymbol) {
            for (int i = startSymbol + 1; i <= endSymbol - 1; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = endSymbol + 1; i <= startSymbol - 1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
