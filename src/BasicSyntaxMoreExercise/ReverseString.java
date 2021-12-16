package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder reverseStringBuilder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char symbol = input.charAt(i);
            reverseStringBuilder.append(symbol);
        }
        String reverseString = reverseStringBuilder.toString();
        System.out.println(reverseString);
    }
}
