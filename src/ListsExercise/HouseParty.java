package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            if(tokens[2].equals("going!")){
                if(!guests.contains(name)){
                    guests.add(name);
                }else{
                    System.out.printf("%s is already in the list!%n",name);
                }
            }else if(tokens[2].equals("not")){
                if(guests.contains(name)){
                    guests.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }
        }
        printList(guests);
    }

    private static void printList(List<String> guests) {
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
