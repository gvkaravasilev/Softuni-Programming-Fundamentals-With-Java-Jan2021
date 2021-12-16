package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());;

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            switch (command) {
                case "Delete":
                    numbers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int position = Integer.parseInt(tokens[2]);
                    numbers.add(position,element);
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
}
