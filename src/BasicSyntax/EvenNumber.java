package BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        while(true){
            if(number % 2 == 0){
                System.out.printf("The number is: %d",Math.abs(number));
                break;
            }

            System.out.println("Please write an even number.");
            number = Integer.parseInt(scan.nextLine());
        }
    }
}
