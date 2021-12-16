package MiddExamPractise.ProgrammingFundamentals02MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scan.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    if(isValid(firstIndex,numbers.length) && isValid(secondIndex, numbers.length)){
                        int temp = numbers[firstIndex];
                        numbers[firstIndex] = numbers[secondIndex];
                        numbers[secondIndex] = temp;
                    }

                    break;
                case "multiply":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    if(isValid(index1, numbers.length) && isValid(index2,numbers.length)){
                        int multiplication = numbers[index1] * numbers[index2];
                        numbers[index1] = multiplication;
                    }

                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }


            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i < numbers.length - 1){
                System.out.print(", ");
            }
        }
    }

    private static boolean isValid(int firstIndex, int length) {
        return firstIndex >= 0 && firstIndex <= length - 1;
    }
}
