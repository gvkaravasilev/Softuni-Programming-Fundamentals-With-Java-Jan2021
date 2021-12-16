package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentElement = numbers.get(i);
            int oppositeElement = numbers.get(numbers.size() - 1);
            int sum = currentElement + oppositeElement;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
