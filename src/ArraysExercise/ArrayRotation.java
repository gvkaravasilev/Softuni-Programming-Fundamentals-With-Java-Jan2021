package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotations; i++) {
            int temp = array[0];

            for (int j = 0; j < array.length - 1; j++) {

                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
