package DataTypeAndVariables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double britishPounds = Double.parseDouble(scan.nextLine());
        double dollars = britishPounds * 1.31;
        System.out.printf("%.3f",dollars);
    }
}
