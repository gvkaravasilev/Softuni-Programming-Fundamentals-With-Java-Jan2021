package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int group = Integer.parseInt(scan.nextLine());
        String typeOfGroup = scan.nextLine();
        String day = scan.nextLine();

        double price = 0.0;

        //Students	8.45	9.80	10.46
        //Business	10.90	15.60	16
        //Regular	15	20	20      22.50
        if (day.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                price = 8.45;
            } else if (typeOfGroup.equals("Business")) {
                price = 10.90;
            } else if (typeOfGroup.equals("Regular")) {
                price = 15;
            }
        } else if (day.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                price = 9.80;
            } else if (typeOfGroup.equals("Business")) {
                price = 15.60;
            } else if (typeOfGroup.equals("Regular")) {
                price = 20;
            }
        } else if (day.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                price = 10.46;
            } else if (typeOfGroup.equals("Business")) {
                price = 16;
            } else if (typeOfGroup.equals("Regular")) {
                price = 22.50;
            }
        }
        //•	Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
        //•	Business – if the group is bigger than or equal to  100 people 10 of them can stay for free.
        //•	Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
        double totalPrice = group * price;
        if(typeOfGroup.equals("Students") && group >= 30){
            totalPrice = totalPrice * 0.85;
        }
        if(typeOfGroup.equals("Business") && group >= 100){
            totalPrice = (group - 10) * price;
        }
        if(typeOfGroup.equals("Regular") && group >= 10 && group <= 20){
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
