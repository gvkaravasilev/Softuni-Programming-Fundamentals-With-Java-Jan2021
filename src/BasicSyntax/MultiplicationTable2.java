package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        for (int i = times; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
        if (times > 10) {
            System.out.printf("%d X %d = %d%n",n,times,n * times);
        }
    }
}
