package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam03;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while (!input.equals("Reveal")){

            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            switch (command){

                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    concealedMessage = concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage.toString());

                    break;
                case "Reverse":
                    String substringToBeCut = tokens[1];
                    StringBuilder reversedSubstring = new StringBuilder();


                    for (int i = substringToBeCut.length() - 1; i >= 0 ; i--) {
                        char currentChar = substringToBeCut.charAt(i);
                        reversedSubstring.append(currentChar);
                    }
                    if(concealedMessage.toString().contains(substringToBeCut)){
                        int indexOfSubstring = concealedMessage.toString().indexOf(substringToBeCut);
                        String replacedMessage = concealedMessage.toString().substring(0, indexOfSubstring) + concealedMessage.toString().substring(indexOfSubstring + substringToBeCut.length());
                        concealedMessage = new StringBuilder(replacedMessage);
                        concealedMessage.append(reversedSubstring);
                        System.out.println(concealedMessage.toString());
                    }else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":

                    String substringToBeReplaced = tokens[1];
                    String replacement = tokens[2];

                    concealedMessage = new StringBuilder(concealedMessage.toString().replace(substringToBeReplaced, replacement));

                    System.out.println(concealedMessage.toString());
                    break;
            }

            input = scan.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", concealedMessage.toString());
    }
}
