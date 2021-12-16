package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String firstElement = input[0];
            String secondElement = input[1];
            if((i + 1)  % 2 == 0){
                secondArray[i] = firstElement;
                firstArray[i] = secondElement;

            }else{
                firstArray[i] = firstElement;
                secondArray[i] = secondElement;
            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));

    }
}
