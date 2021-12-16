package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightsabersPricePerPiece = Double.parseDouble(scan.nextLine());
        double robePricePerPiece = Double.parseDouble(scan.nextLine());
        double beltPricePerPiece = Double.parseDouble(scan.nextLine());

        double lightsabersTotalPrice = lightsabersPricePerPiece * Math.ceil(studentsCount * 1.1);
        double robesTotalPrice = robePricePerPiece * studentsCount;
        double freeBelts = studentsCount / 6;
        double beltsTotalPrice = (studentsCount - freeBelts) * beltPricePerPiece;

        double totalPrice = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice - amountOfMoney);
        }
    }
}
