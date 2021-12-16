package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scan.nextLine());
        Map<String, String> customers = new LinkedHashMap<>();

        for (int i = 0; i < commandsCount; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String command = input[0];
            String customerName = input[1];

            switch (command) {
                case "register":
                    String plate = input[2];
                    if (!customers.containsKey(customerName)) {
                        customers.put(customerName, plate);
                        System.out.printf("%s registered %s successfully%n", customerName, customers.get(customerName));
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", customers.get(customerName));
                    }
                    break;
                case "unregister":
                    if (!customers.containsKey(customerName)) {
                        System.out.printf("ERROR: user %s not found%n", customerName);
                    } else {
                        customers.remove(customerName);
                        System.out.printf("%s unregistered successfully%n", customerName);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : customers.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
