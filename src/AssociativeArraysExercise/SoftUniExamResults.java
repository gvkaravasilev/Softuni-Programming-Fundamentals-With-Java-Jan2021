package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> languageOccurrences = new LinkedHashMap<>();

        while(!input.equals("exam finished")){
            String[] tokens = input.split("-");
            String username = tokens[0];

            if(tokens.length == 3){
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if(!userPoints.containsKey(username)){
                    userPoints.put(username, points);
                }
                userPoints.put(username, points);

                if(!languageOccurrences.containsKey(language)){
                    languageOccurrences.put(language, 1);
                }else {
                    languageOccurrences.put(language, languageOccurrences.get(language) + 1);
                }


            }else if(tokens.length == 2){
                userPoints.remove(username);
            }
            input = scan.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()) );

        System.out.println("Submissions:");
        languageOccurrences.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));




    }
}
