package Arrays;

import java.util.Scanner;

public class EvenAndOddDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split(" ");

        int evenSum = 0;
        int oddSum = 0;

        for (String number : numbers) {
            int current = Integer.parseInt(number);
            if(current % 2 == 0){
                evenSum += current;
            }else{
                oddSum += current;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
