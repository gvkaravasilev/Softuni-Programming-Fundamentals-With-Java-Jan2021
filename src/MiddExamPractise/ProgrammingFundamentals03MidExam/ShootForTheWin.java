package MiddExamPractise.ProgrammingFundamentals03MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            int index = Integer.parseInt(tokens[0]);
            if(index >= 0 && index <= numbers.length - 1) {
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i] != -1){
                        if(numbers[i] > numbers[index]){
                            numbers[i] -= numbers[index];
                        }else{
                            numbers[i] += numbers[index];
                        }
                    }
                    numbers[index] = -1;
                }
            }
            input = scan.nextLine();
        }
        int shotTargets = 0;
        for (int number : numbers) {
            if(number == -1){
                shotTargets++;
            }
        }
        System.out.printf("Shot targets: %d -> ",shotTargets);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    //private static boolean isValid(int index, int length) {
       // return index >= 0 && index <= length - 1;
    }

