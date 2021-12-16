package AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<String>> employeeInfo = new TreeMap<>();

        while (!input.equals("End")){
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeId = tokens[1];

            if(!employeeInfo.containsKey(companyName)){
                employeeInfo.put(companyName, new ArrayList<>());
            }
            if(employeeInfo.containsKey(companyName) && !employeeInfo.get(companyName).contains(employeeId)){
                employeeInfo.get(companyName).add(employeeId);
            }


            input = scan.nextLine();
        }
        employeeInfo.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream()
                            .forEach(id -> System.out.println("-- " + id));
                });
    }
}
