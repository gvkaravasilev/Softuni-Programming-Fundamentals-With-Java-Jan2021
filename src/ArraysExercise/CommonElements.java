package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");
        for (String secondArrayItem : secondArray) {
            for (String firstArrayItem : firstArray) {
                if(secondArrayItem.equals(firstArrayItem)){
                    System.out.print(secondArrayItem + " ");
                }
            }
        }
    }
}
