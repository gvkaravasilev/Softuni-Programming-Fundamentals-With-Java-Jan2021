package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(getMultiplyOfEvensAndOdds(Math.abs(number)));

    }
    public static Integer getEvenSum(int n){
        int evenSum = 0;
        while (n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            }
            n /= 10;
        }
        return evenSum;
    }
    public static Integer getOddSum(int n){
        int oddSum = 0;
        while (n > 0){
            int digit = n % 10;
            if(digit % 2 != 0){
                oddSum += digit;
            }
            n /= 10;
        }
        return oddSum;
    }
    public static Integer getMultiplyOfEvensAndOdds(int n){
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;
    }
}
