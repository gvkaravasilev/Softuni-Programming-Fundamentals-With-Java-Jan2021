package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        Map<String, Integer> resourcesAndQuantities = new LinkedHashMap<>();

        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());

            if(!resourcesAndQuantities.containsKey(resource)){
                resourcesAndQuantities.put(resource, quantity);
            }else {
                resourcesAndQuantities.put(resource, resourcesAndQuantities.get(resource) + quantity);
            }

            resource = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesAndQuantities.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
