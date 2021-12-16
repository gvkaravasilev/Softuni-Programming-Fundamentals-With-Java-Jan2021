package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam05;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder rawActivationKey = new StringBuilder(scan.nextLine());

        String commandInput = scan.nextLine();

        while (!commandInput.equals("Generate")) {
            String[] tokens = commandInput.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String containedText = tokens[1];
                    if (rawActivationKey.toString().contains(containedText)) {
                        System.out.printf("%s contains %s%n", rawActivationKey, containedText);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);

                    for (int i = startIndex; i < endIndex; i++) {
                        char currentChar = rawActivationKey.charAt(i);

                        if (upperOrLower.equals("Upper")) {
                            rawActivationKey.setCharAt(i, Character.toUpperCase(currentChar));
                        } else if (upperOrLower.equals("Lower")) {
                            rawActivationKey.setCharAt(i, Character.toLowerCase(currentChar));
                        }
                    }
                    System.out.println(rawActivationKey.toString());

                    break;
                case "Slice":

                    int startIndexToSlice = Integer.parseInt(tokens[1]);
                    int endIndexToSlice = Integer.parseInt(tokens[2]);
                    rawActivationKey.replace(startIndexToSlice, endIndexToSlice, "");
                    System.out.println(rawActivationKey.toString());
                    break;


            }


            commandInput = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", rawActivationKey.toString());
    }
}
