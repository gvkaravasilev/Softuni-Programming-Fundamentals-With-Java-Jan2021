package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int snowballSnowGlobal = 0;
        int snowballTimeGlobal = 0;
        int snowballQualityGlobal = 0;

        double maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime),snowballQuality);

            if(snowballValue > maxValue){
                maxValue = snowballValue;
                snowballSnowGlobal = snowballSnow;
                snowballTimeGlobal = snowballTime;
                snowballQualityGlobal = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowGlobal,snowballTimeGlobal,maxValue,snowballQualityGlobal);
    }
}
