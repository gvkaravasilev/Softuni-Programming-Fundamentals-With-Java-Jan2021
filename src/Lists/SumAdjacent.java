package Lists;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double sum = numbers.get(i) + numbers.get(i + 1);
            if(numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i,sum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat formatted = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(formatted.format(number) + " ");
        }
    }
}
