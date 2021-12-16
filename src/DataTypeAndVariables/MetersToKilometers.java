package DataTypeAndVariables;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = scan.nextInt();
        double kilometers = (double)meters/1000;
        System.out.printf("%.2f",kilometers);
    }
}
