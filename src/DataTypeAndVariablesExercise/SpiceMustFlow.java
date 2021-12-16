package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());

        int spiceAmount = 0;
        int daysCount = 0;

        while (startingYield > 0) {
            if (startingYield < 100) {
                if (spiceAmount < 26) {
                    break;
                }
                spiceAmount -= 26;
                break;
            }
            spiceAmount += startingYield - 26;
            startingYield -= 10;
            daysCount++;
        }
        System.out.println(daysCount);
        System.out.print(spiceAmount);
    }
}
