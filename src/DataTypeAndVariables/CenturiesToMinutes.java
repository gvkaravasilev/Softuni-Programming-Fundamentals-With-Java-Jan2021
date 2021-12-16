package DataTypeAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int centuries = Integer.parseInt(scan.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;

        //1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries,years,days,hours,minutes);
    }
}
