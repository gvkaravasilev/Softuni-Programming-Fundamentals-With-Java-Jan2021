package MiddExam;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] gifts = scan.nextLine().split("\\s+");

        String input = scan.nextLine();

        while (!input.equals("No Money")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "OutOfStock":
                    String gift = tokens[1];
                    for (int i = 0; i < gifts.length; i++) {
                        if (gifts[i].equals(gift)) {
                            gifts[i] = "None";
                        }
                    }
                    break;
                case "Required":
                    String requiredGift = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (isValid(index, gifts.length)) {
                        gifts[index] = requiredGift;
                    }
                    break;
                case "JustInCase":
                    String justInCaseGift = tokens[1];
                    gifts[gifts.length - 1] = justInCaseGift;
                    break;

            }


            input = scan.nextLine();
        }
        for (String gift : gifts) {
            if (!gift.equals("None")) {
                System.out.print(gift + " ");
            }
        }
    }

    private static boolean isValid(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
