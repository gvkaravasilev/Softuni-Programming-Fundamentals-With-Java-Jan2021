package ProgrammingFundamentalsFinalExam01;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scan.nextLine());

        String inputInstructions = scan.nextLine();

        while (!inputInstructions.equals("Decode")) {

            String[] tokens = inputInstructions.split("\\|");
            String command = tokens[0];

            switch (command) {

                case "Move":

                    int numberOfLetters = Integer.parseInt(tokens[1]);
                    StringBuilder firstNChars = new StringBuilder();

                    for (int i = 0; i < numberOfLetters; i++) {
                        char currentChar = encryptedMessage.charAt(i);
                        firstNChars.append(currentChar);
                    }
                    String replacedMessage = encryptedMessage.toString().replace(firstNChars.toString(), "");
                    encryptedMessage = new StringBuilder(replacedMessage);
                    encryptedMessage.append(firstNChars.toString());

                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    encryptedMessage = encryptedMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    String messageAfterReplacement = encryptedMessage.toString().replace(substring, replacement);
                    encryptedMessage = new StringBuilder(messageAfterReplacement);
                    break;
            }


            inputInstructions = scan.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", encryptedMessage.toString());
    }
}
