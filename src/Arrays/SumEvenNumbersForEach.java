package Arrays;

import java.util.Scanner;

public class SumEvenNumbersForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split(" ");

        int sum = 0;
        for (String number : numbers) {
            int current = Integer.parseInt(number);
            if( current % 2 == 0){
                sum += current;
            }
        }
        System.out.println(sum);
    }
}
