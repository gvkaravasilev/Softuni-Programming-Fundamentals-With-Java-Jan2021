package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String customersInput = scan.nextLine();
        String regex = "^%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";

        Pattern pattern = Pattern.compile(regex);
        double pricePerClient = 0;
        double totalSum = 0;
        while (!customersInput.equals("end of shift")) {
            Matcher matcher = pattern.matcher(customersInput);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                pricePerClient = count * price;
                System.out.printf("%s: %s - %.2f%n", customer, product, pricePerClient);
                totalSum += pricePerClient;
            }

            customersInput = scan.nextLine();
        }
        System.out.printf("Total income: %.2f",totalSum);
    }
}
