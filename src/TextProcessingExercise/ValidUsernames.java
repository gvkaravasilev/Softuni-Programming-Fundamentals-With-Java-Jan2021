package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if(isValid(username)){
                System.out.println(username);
            }
        }
    }

    private static boolean isValid(String username) {

        if(username.length() < 3 || username.length() > 16){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char currentSymbol = username.charAt(i);

            if(!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_'){
                return false;
            }
        }
        return true;
    }
}
