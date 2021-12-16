package BasicSyntax;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            counter++;
            sum += i;
            if(counter == n){
                System.out.printf("Sum: %d%n", sum);
                break;
            }
        }

    }
}
