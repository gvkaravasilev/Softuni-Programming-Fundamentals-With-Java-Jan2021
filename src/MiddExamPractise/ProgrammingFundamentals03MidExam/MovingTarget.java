package MiddExamPractise.ProgrammingFundamentals03MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            switch (command){
                case "Shoot":
                    int power = Integer.parseInt(tokens[2]);
                    int currentElement = targets.get(index);
                    currentElement -= power;
                    targets.set(index,currentElement);

                    if(currentElement <= 0){
                        targets.remove(index);
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(tokens[2]);
                    if(isValid(index,targets.size())){
                        targets.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(tokens[2]);
                    if(index - radius >= 0 && index + radius < targets.size() - 1){
                        targets.remove(index);
                        targets.remove(index - radius);
                        targets.remove(radius * 2 + 1);
                    }else {
                        System.out.println("Strike missed!");
                    }


                    break;
            }


            input = scan.nextLine();
        }
        print(targets);
    }

    private static void print(List<Integer> targets) {
        for (int i = 1; i <= targets.size() - 1; i++) {
            System.out.print(i + "|");
            if(i == targets.size() - 1){
                System.out.print(i + 1);
            }
        }
    }

    private static boolean isValid(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
