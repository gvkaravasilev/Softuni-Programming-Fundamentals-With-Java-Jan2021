package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Done")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){

                case "TakeOdd":
                    StringBuilder cutPassword = new StringBuilder();
                    for (int i = 1; i <= password.length() - 1 ; i += 2) {
                       char currentSymbol = password.charAt(i);
                       cutPassword.append(currentSymbol);
                    }
                    password = cutPassword.toString();
                    System.out.println(password);

                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String subStringToBeCut = password.substring(index, index + length);
                    password = password.replaceFirst(subStringToBeCut, "");

                    System.out.println(password);

                    break;
                case "Substitute":

                    String substringToBeSubstituted = tokens[1];
                    String substitute = tokens[2];

                    if(password.contains(substringToBeSubstituted)){
                       password = password.replace(substringToBeSubstituted, substitute);
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }

                    break;

            }

            input = scan.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }
}
