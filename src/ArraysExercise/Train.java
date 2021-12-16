package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int train = Integer.parseInt(scan.nextLine());
        int[] wagons = new int[train];
        int sum = 0;

        for (int i = 0; i < train; i++) {
            int currentWagon = Integer.parseInt(scan.nextLine());
            wagons[i] = currentWagon;
            sum += wagons[i];
        }
        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
