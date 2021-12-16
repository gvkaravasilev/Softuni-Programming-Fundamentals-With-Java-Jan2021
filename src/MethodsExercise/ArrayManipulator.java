package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String input = scan.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command){
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    break;
                case "max":
                    String maxEvenOrOdd = tokens[1];
                    if(maxEvenOrOdd.equals("even")){

                    }else if(maxEvenOrOdd.equals("odd")){

                    }
                    break;
                case "min":
                    String minEvenOrOdd = tokens[1];
                    if(minEvenOrOdd.equals("even")){

                    }else if(minEvenOrOdd.equals("odd")){

                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if(evenOrOdd.equals("even")){

                    }else if(evenOrOdd.equals("odd")){

                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(tokens[1]);
                    String oddOrEven = tokens[2];
                    if(oddOrEven.equals("even")){

                    }else if(oddOrEven.equals("odd")){

                    }
                    break;


            }


            input = scan.nextLine();
        }
    }

    private static void exchange(int[] numbers, String[] commands){

    }
}
