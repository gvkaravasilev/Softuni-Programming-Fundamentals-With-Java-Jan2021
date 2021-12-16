package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam05;


import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputCities = scan.nextLine();

        Map<String, List<Integer>> cities = new LinkedHashMap<>();

        while (!inputCities.equals("Sail")) {
            String[] citiTokens = inputCities.split("\\|\\|");

            String city = citiTokens[0];
            int population = Integer.parseInt(citiTokens[1]);
            int gold = Integer.parseInt(citiTokens[2]);

            if (!cities.containsKey(city)) {

                cities.put(city, Arrays.asList(population, gold));
            } else {
                cities.put(city, Arrays.asList(cities.get(city).get(0) + population, cities.get(city).get(1) + gold));
            }
            inputCities = scan.nextLine();
        }

        String inputEvents = scan.nextLine();

        while (!inputEvents.equals("End")) {
            String[] tokens = inputEvents.split("=>");

            String command = tokens[0];
            String town = tokens[1];

            switch (command) {
                case "Plunder":

                    int killedPeople = Integer.parseInt(tokens[2]);
                    int stolenGold = Integer.parseInt(tokens[3]);

                    int currentPeople = cities.get(town).get(0);
                    int currentGold = cities.get(town).get(1);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, stolenGold, killedPeople);

                    int remainingPeople = currentPeople - killedPeople;
                    int remainingGold = currentGold - stolenGold;

                    cities.get(town).set(0, remainingPeople);
                    cities.get(town).set(1, remainingGold);

                    if (remainingPeople <= 0 || remainingGold <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        cities.remove(town);
                    }

                    break;
                case "Prosper":

                    int prosperedGold = Integer.parseInt(tokens[2]);
                    int goldBeforeProsper = cities.get(town).get(1);


                    if (prosperedGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        cities.get(town).set(1, goldBeforeProsper + prosperedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperedGold, town, cities.get(town).get(1));
                    }

                    break;
            }


            inputEvents = scan.nextLine();
        }

        // gold -> descending order
        //city name -> ascending order
        if (!cities.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            cities.entrySet().stream().sorted((left, right) -> {
                int result = right.getValue().get(1).compareTo(left.getValue().get(1));
                if (result == 0) {
                    result = left.getKey().compareTo(right.getKey());
                }
                return result;
            }).forEach(city -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", city.getKey(), city.getValue().get(0), city.getValue().get(1)));

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    // {town1} -> Population: {people} citizens, Gold: {gold} kg
}
