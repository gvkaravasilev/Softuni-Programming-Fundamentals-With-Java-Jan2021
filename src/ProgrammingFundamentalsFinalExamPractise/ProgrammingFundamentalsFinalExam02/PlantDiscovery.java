package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam02;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer > plantStats = new LinkedHashMap<>();
        Map<String, List<Double>> plantsAndRatings = new LinkedHashMap<>();

        double rating = 0;

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            String[] tokens = input.split("<->");
            String plant = tokens[0];
            int  rarity = Integer.parseInt(tokens[1]);

            plantStats.put(plant, rarity);


        }
        String commandsInput = scan.nextLine();

        while(!commandsInput.equals("Exhibition")){

            String[] tokens = commandsInput.split(": ");
            String command = tokens[0];
            String[] secondPartOfTokens = tokens[1].split(" - ");

            String plantName = secondPartOfTokens[0];

            switch (command){

                case "Rate":
                    double ratingToBeAdded = Double.parseDouble(secondPartOfTokens[1]);

                    if(!plantsAndRatings.containsKey(plantName)){
                        plantsAndRatings.put(plantName, new ArrayList<>());
                    }
                    plantsAndRatings.get(plantName).add(ratingToBeAdded);

                    break;
                case "Update":
                    int  newRarity = Integer.parseInt(secondPartOfTokens[1]);
                    plantStats.put(plantName, newRarity);
                    break;
                case "Reset":

                    plantsAndRatings.get(plantName).clear();

                    break;

            }



            commandsInput = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");


    }
}
