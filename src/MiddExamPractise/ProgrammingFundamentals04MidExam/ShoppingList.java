package MiddExamPractise.ProgrammingFundamentals04MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scan.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Go Shopping!")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Urgent":
                    String itemToBeAdded = tokens[1];
                    int index = groceries.indexOf(groceries.get(0));
                    if(!groceries.contains(itemToBeAdded)){
                        groceries.add(index,itemToBeAdded);
                    }
                    break;
                case "Unnecessary":
                    String unnecessaryItem = tokens[1];
                    if(groceries.contains(unnecessaryItem)){
                        groceries.remove(unnecessaryItem);
                    }
                    break;
                case "Correct":
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    int indexToBeSwapped = groceries.indexOf(oldItem);
                    if(groceries.contains(oldItem)){
                        groceries.remove(oldItem);
                        groceries.add(indexToBeSwapped,newItem);
                    }
                    break;
                case "Rearrange":
                    String itemToBeRearranged = tokens[1];
                    if(groceries.contains(itemToBeRearranged)){
                        groceries.remove(itemToBeRearranged);
                        groceries.add(itemToBeRearranged);
                    }
                    break;
            }



            input = scan.nextLine();
        }
        System.out.println(String.join(", ",groceries));
    }
}
