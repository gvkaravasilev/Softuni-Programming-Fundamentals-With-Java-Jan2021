package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] words = input.split("\\s+");
        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomIndex = random.nextInt(words.length);
            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;

        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
