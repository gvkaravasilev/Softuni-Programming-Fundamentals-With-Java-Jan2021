package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToBeInserted = Integer.parseInt(tokens[1]);
                    int insertIndex = Integer.parseInt(tokens[2]);
                    if (isValidIndex(insertIndex, numbers.size())) {
                        numbers.add(insertIndex, numberToBeInserted);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToBeRemoved = Integer.parseInt(tokens[1]);
                    if(isValidIndex(indexToBeRemoved,numbers.size())){
                        numbers.remove(indexToBeRemoved);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if(direction.equals("left")){
                        for (int i = 0; i < count; i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);

                        }
                    }else if(direction.equals("right")){
                        for (int i = 0; i < count; i++) {
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }
                    }
                    break;

            }

            input = scan.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValidIndex(int insertIndex, int size) {
        return insertIndex >= 0 && insertIndex <= size - 1;
    }
}
