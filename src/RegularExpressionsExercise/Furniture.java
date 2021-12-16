package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+.?[0-9]*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        List <String> items = new ArrayList<>();

        double totalSum = 0;
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String item = matcher.group("furniture");
                Double price = Double.parseDouble(matcher.group("price"));
                int itemQuantity = Integer.parseInt(matcher.group("quantity"));
                items.add(item);
                totalSum += price * itemQuantity;
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        items.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
