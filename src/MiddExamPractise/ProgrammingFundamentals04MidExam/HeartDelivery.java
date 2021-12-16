package MiddExamPractise.ProgrammingFundamentals04MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String arraysAsString = scan.nextLine();

        int[] numbers = Arrays.stream(arraysAsString.split("@"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isAlreadyZero = false;
        String input = scan.nextLine();
        while (!input.equals("Love!")){
            int indexZero = 0;
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int jumpIndex = Integer.parseInt(tokens[1]);
            for (int i = 0; i < numbers.length ; i++) {
                int currentElement = numbers[i];
                for (int j = numbers[0]; j < numbers[jumpIndex]; j++) {
                    numbers[j] -= 2;
                    if(numbers[j] == 0){
                        System.out.printf("Place %d has Valentine's day",j);
                        isAlreadyZero = true;
                        indexZero = j;
                    }
                }
                
            }
            if(isAlreadyZero){
                System.out.printf("Place %d already had Valentine's day.",indexZero);
            }
            input = scan.nextLine();
        }
    }
}
