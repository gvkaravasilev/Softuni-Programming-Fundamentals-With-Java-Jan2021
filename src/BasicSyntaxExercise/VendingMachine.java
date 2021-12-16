package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        double sum = 0;
        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);
            if (currentCoin == 0.1 || currentCoin == 0.2
                    || currentCoin == 0.5 || currentCoin == 1 || currentCoin == 2) {
                sum += currentCoin;
            }else{
                System.out.printf("Cannot accept %.2f %n",Double.parseDouble(input));
            }
            input = scan.nextLine();
        }
        String product = scan.nextLine();
        double price = 0.0;
        boolean isProduct = false;
        while(!product.equals("End")){
            switch (product){
                case "Nuts":
                    price = 2.0;
                    isProduct = true;
                    break;
                case "Water":
                    price = 0.7;
                    isProduct = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isProduct = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isProduct = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isProduct = true;
                    break;
            }
            if(sum < price){
                System.out.println("Sorry, not enough money");
            }else if(isProduct){
                System.out.printf("Purchased %s%n",product);
                sum -= price;
            }else{
                System.out.println("Invalid product");
            }
            product = scan.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
