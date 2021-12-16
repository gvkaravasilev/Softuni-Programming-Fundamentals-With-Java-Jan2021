package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine().toLowerCase();
        printVowelsCount(word);

    }
    public static void printVowelsCount(String word){
        int vowelsCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentSymbol = word.charAt(i);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCounter++;
                    break;
            }
        }
        System.out.println(vowelsCounter);
    }
}
