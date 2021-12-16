package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //OutFall 4	$39.99
        //CS: OG	$15.99
        //Zplinter Zell	$19.99
        //Honored 2	$59.99
        //RoverWatch	$29.99
        //RoverWatch Origins Edition	$39.99

        double currentBalance = Double.parseDouble(scan.nextLine());
        String inputGame = scan.nextLine();
        double price;
        double totalSpend = 0;
        double totalMoney = currentBalance;
        while (!inputGame.equals("Game Time")) {
           price = 0;
            switch (inputGame) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not found");
            }
            if(price > currentBalance){
                System.out.println("Too expensive");
                price = 0;
                inputGame = scan.nextLine();
                continue;
            }
            currentBalance -= price;
           if(currentBalance >= 0){
               System.out.printf("Bought %s%n",inputGame);
           }
           if(currentBalance < 0){
               System.out.println("Out of money!");
               break;
           }
            inputGame = scan.nextLine();
        }
        if(currentBalance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n",currentBalance - totalMoney,totalMoney);
        }else{
            System.out.println("Out of money!");
        }
    }
}
