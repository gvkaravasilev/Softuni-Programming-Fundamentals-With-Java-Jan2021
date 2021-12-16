package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;


public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Arrays.stream(input)
                .map(e -> Integer.parseInt(e))
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .forEach(e -> System.out.print(e + " "));
    }
}
