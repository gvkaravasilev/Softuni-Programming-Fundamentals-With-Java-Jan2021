package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam03;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int carsCount = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> carsStats = new LinkedHashMap<>();

        for (int i = 0; i < carsCount; i++) {
            String carsInput = scan.nextLine();

            String[] carTokens = carsInput.split("\\|");

            String car = carTokens[0];
            int mileage = Integer.parseInt(carTokens[1]);
            int fuel = Integer.parseInt(carTokens[2]);

            carsStats.put(car, Arrays.asList(mileage, fuel));

        }
        String commandsInput = scan.nextLine();

        while (!commandsInput.equals("Stop")) {
            String[] tokens = commandsInput.split(" : ");

            String command = tokens[0];
            String car = tokens[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);

                    int currentFuel = carsStats.get(car).get(1);
                    int currentMileage = carsStats.get(car).get(0);

                    if (currentFuel <= fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        currentMileage += distance;
                        currentFuel -= fuel;
                        carsStats.get(car).set(0, currentMileage);
                        carsStats.get(car).set(1, currentFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }

                    if (carsStats.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        carsStats.remove(car);
                    }


                    break;
                case "Refuel":

                    int fuelToRefill = Integer.parseInt(tokens[2]);
                    int fuelBeforeRefilling = carsStats.get(car).get(1);
                    int currentFuelLiters = carsStats.get(car).get(1);

                    currentFuelLiters += fuelToRefill;
                    if(currentFuelLiters > 75){
                        currentFuelLiters = 75;
                    }
                    carsStats.get(car).set(1, currentFuelLiters);
                    System.out.printf("%s refueled with %d liters%n", car,currentFuelLiters - fuelBeforeRefilling);


                    break;
                case "Revert":
                    int kilometres = Integer.parseInt(tokens[2]);
                    int currentKm = carsStats.get(car).get(0);

                    currentKm -= kilometres;
                    carsStats.get(car).set(0, currentKm);


                    if(currentKm < 10000){
                        carsStats.get(car).set(0, 10000);
                    }else{
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometres);
                    }
                    break;


            }


            commandsInput = scan.nextLine();
        }
        carsStats.entrySet().stream()
                .sorted((left, right) -> {
                    int result = right.getValue().get(0).compareTo(left.getValue().get(0));
                    if(result == 0){
                        result = left.getKey().compareTo(right.getKey());
                    }
                    return result;
                }).forEach(car -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car.getKey(), car.getValue().get(0), car.getValue().get(1)));

    }
}
