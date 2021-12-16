package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Double> productPrices = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String[] data = input.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            productPrices.put(product, price);

            if(!productQuantity.containsKey(product)){
                productQuantity.put(product, quantity);
            }else {
                productQuantity.put(product, productQuantity.get(product) + quantity);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * productQuantity.get(entry.getKey()));
        }
    }
}
