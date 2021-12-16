package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if(currentChar == ' '){
                continue;
            }
            if(!occurrences.containsKey(currentChar)){
                occurrences.put(currentChar, 1);
            }else {
                occurrences.put(currentChar, occurrences.get(currentChar) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
