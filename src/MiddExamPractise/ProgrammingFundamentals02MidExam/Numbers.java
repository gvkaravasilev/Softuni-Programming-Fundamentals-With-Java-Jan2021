package MiddExamPractise.ProgrammingFundamentals02MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        List<Integer> topNumbers = new ArrayList<>();
        double average = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            sum += currentElement;
            average = sum / numbers.length;

            if(currentElement > average){
                topNumbers.add(numbers[i]);
            }
        }
        for (Integer topNumber : topNumbers) {
            System.out.print(topNumber + " ");
        }
    }
}
