package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        if (!charValidate(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!contentValidate(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitValidate(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (charValidate(password) && contentValidate(password) && digitValidate(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean charValidate(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean contentValidate(String password) {
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentSymbol = password.charAt(i);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 122;
            boolean isCapitalLetter = currentSymbol >= 65 && currentSymbol <= 90;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if(!isSmallLetter && !isCapitalLetter && !isDigit){
                return false;
            }
        }
        return true;

    }

    public static boolean digitValidate(String password) {
        int digitsCount = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                digitsCount++;
            }
        }
        if (digitsCount >= 2) {
            return true;
        } else {
            return false;
        }
    }

}
