package ObjectsAndClassesExercise.VehicleCalalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt(input.split("\\s+")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);

            input = scan.nextLine();
        }
        String inputModel = scan.nextLine();


        while (!inputModel.equals("Close the Catalogue")){

            for (Vehicle vehicle : vehicleList) {
                if(inputModel.equals(vehicle.getModel())){
                    System.out.println(vehicle);
                }
            }
            inputModel = scan.nextLine();
        }
        double carHpSum = 0;
        int carCount = 0;

        double truckHpSum = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicleList) {
            if(vehicle.getVehicleType().equals("car")){
                carHpSum += vehicle.getHorsepower();
                carCount++;
            }else if(vehicle.getVehicleType().equals("truck")){
                truckHpSum += vehicle.getHorsepower();
                truckCount++;
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",carHpSum/carCount);
        System.out.printf("Trucks have average horsepower of: %.2f.",truckHpSum/truckCount);
    }
}
