package MiddExamPractise.ProgrammingFundamentals05MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Craft!")){
            String[] tokens = input.split(" - ");

            if(tokens[0].equals("Collect")){
                String itemToBeAdded = tokens[1];
                if(!items.contains(itemToBeAdded)){
                    items.add(itemToBeAdded);
                }
            }else if(tokens[0].equals("Drop")){
                String itemToBeDropped = tokens[1];
                if(items.contains(itemToBeDropped)){
                    items.remove(itemToBeDropped);
                }
            }else if(tokens[0].equals("Combine Items")){
                String[] splitItems = tokens[1].split(":");
                String oldItem = splitItems[0];
                String newItem = splitItems[1];
                int index = items.indexOf(oldItem);
                if(items.contains(oldItem)){
                    items.add(index + 1,newItem);
                }

            }else if(tokens[0].equals("Renew")){
                String itemToBeRenewed = tokens[1];
                if(items.contains(itemToBeRenewed)){
                    items.remove(itemToBeRenewed);
                    items.add(itemToBeRenewed);
                }
            }

            input = scan.nextLine();
        }
        System.out.println(String.join(", ",items));
    }
}
