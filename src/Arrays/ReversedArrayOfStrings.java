package Arrays;

import java.util.Scanner;

public class ReversedArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -  1] = temp;
        }
        System.out.println(String.join(" ",array));
    }
}
