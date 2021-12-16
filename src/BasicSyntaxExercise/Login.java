package BasicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            passwordBuilder.append(symbol);
        }
        String password = passwordBuilder.toString();

        String input = scan.nextLine();
        int loginCounter = 0;
        while (!input.equals(password)){
            loginCounter++;
            if(loginCounter > 3){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scan.nextLine();
        }
        if(input.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}