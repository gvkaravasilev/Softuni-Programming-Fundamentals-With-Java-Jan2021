package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end ; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
