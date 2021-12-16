package DataTypeAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            int sumDigits = 0;
            int digits = i;
            while(digits > 0){
                sumDigits += digits % 10;
                digits /= 10;
            }
            if(sumDigits == 5 || sumDigits == 7 || sumDigits == 11){
                System.out.printf("%d -> True%n",i);
            }else{
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
