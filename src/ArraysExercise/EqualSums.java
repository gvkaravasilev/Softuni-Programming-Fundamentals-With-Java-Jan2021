package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean areEqual = false;
        int index = 0;

        for (int i = 0; i < n.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += n[j];
            }
            for (int j = i + 1; j < n.length; j++) {
                rightSum += n[j];
            }
           if(leftSum == rightSum){
               areEqual = true;
               index = i;
               break;
           }
        }
        if(areEqual){
            System.out.println(index);
        }else{
            System.out.println("no");
        }
    }
}
