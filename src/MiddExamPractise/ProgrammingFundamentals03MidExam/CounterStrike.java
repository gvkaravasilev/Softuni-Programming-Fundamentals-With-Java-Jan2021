package MiddExamPractise.ProgrammingFundamentals03MidExam;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int wonBattles = 0;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (initialEnergy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                return;
            }
            initialEnergy -= distance;
            wonBattles++;

            if (wonBattles % 3 == 0) {
                initialEnergy += wonBattles;
            }


            input = scan.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
    }
}
