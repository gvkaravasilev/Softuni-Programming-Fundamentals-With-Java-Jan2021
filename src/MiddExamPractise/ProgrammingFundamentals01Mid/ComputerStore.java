package MiddExamPractise.ProgrammingFundamentals01Mid;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double priceWithoutTaxes = 0.0;
        double taxes = 0.0;
        while (!input.equals("special") && !input.equals("regular")){
            double currentPrice = Double.parseDouble(input);

            if(currentPrice < 0){
                System.out.println("Invalid price!");
                input = scan.nextLine();
                continue;
            }else {
                priceWithoutTaxes += currentPrice;
                taxes += currentPrice * 0.20;
            }

            input = scan.nextLine();
        }
        double totalPrice = priceWithoutTaxes + taxes;
        if(input.equals("special")){
            totalPrice = totalPrice * 0.90;
        }
        if(totalPrice == 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalPrice);
        }

    }
}
