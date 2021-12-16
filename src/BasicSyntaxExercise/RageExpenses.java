package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());

        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                headsetCount++;}
            if(i % 3 == 0){
                mouseCount++;
            }
            if(i % 6 == 0 ){
                keyboardCount++;
            }
            if(i % 12 == 0){
                displayCount++;
            }
        }
        double headsetTotalPrice = headsetCount * headsetPrice;
        double mouseTotalPrice = mouseCount * mousePrice;
        double keyboardTotalPrice = keyboardCount * keyboardPrice;
        double displayTotalPrice = displayCount * displayPrice;

        double totalExpenses = headsetTotalPrice + mouseTotalPrice + keyboardTotalPrice + displayTotalPrice;
        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);
    }
}
