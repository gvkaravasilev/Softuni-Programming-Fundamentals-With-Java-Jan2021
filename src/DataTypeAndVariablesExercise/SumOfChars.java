package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String charAsString = scan.nextLine();
            char symbol = charAsString.charAt(0);
            sum += symbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
