package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String reversed = "";

        while(!input.equals("END")){
            for (int i = input.length() - 1; i >= 0 ; i--) {
             reversed = reversed + input.charAt(i);
            }
            if(input.equals(reversed)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            input = scan.nextLine();
        }
    }
}
