package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(printPower(n,power)));
    }
    public static Double printPower(double n, int power ){
        return Math.pow(n,power);
    }
}
