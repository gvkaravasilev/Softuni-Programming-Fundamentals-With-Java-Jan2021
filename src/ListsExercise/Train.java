package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if(tokens.length == 2){
                int passengersToAdd = Integer.parseInt(tokens[1]);
                wagons.add(passengersToAdd);
            }else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int currentWagon = wagons.get(i);
                    int index = wagons.indexOf(currentWagon);
                    if(passengers + currentWagon <= maxCapacity){
                        wagons.set(index,passengers + currentWagon);
                        break;
                    }

                }
            }

                    input = scan.nextLine();
        }
        printWagon(wagons);
    }

    private static void printWagon(List<Integer> wagons) {
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }

}
