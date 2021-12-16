package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine()); // poke power
        int distance = Integer.parseInt(scan.nextLine()); // distance
        int exhaustionFactor = Integer.parseInt(scan.nextLine()); // exhaustion factor

        int targetCounter = 0;
        int currentPokePower = pokePower;

        while (currentPokePower >= distance) {
            currentPokePower -= distance;
            targetCounter++;
            if (currentPokePower == pokePower * 0.5 && exhaustionFactor != 0) {
                currentPokePower = currentPokePower / exhaustionFactor;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(targetCounter);
    }
}
