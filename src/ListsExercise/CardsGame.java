package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(true){
            int firstPlayerSum = 0;
            int secondPlayerSum = 0;
            for (int i = 0; i <= firstPlayerCards.size() - 1; i++) {
                for (int j = 0; j <= secondPlayerCards.size() - 1; j++) {
                    if(firstPlayerCards.get(i) > secondPlayerCards.get(j)){
                        firstPlayerCards.add(firstPlayerCards.size() - 1, secondPlayerCards.get(j));
                        firstPlayerCards.add(firstPlayerCards.size() - 2, firstPlayerCards.get(i));
                        secondPlayerCards.remove(secondPlayerCards.get(j));
                        firstPlayerSum += firstPlayerCards.get(i);
                    }else if (secondPlayerCards.get(j) > firstPlayerCards.get(i)){
                        secondPlayerCards.add(secondPlayerCards.size() - 1, firstPlayerCards.get(i));
                        secondPlayerCards.add(secondPlayerCards.size() - 2, secondPlayerCards.get(j));
                        firstPlayerCards.remove(firstPlayerCards.get(i));
                        secondPlayerSum += secondPlayerCards.get(j);
                    }else {
                        firstPlayerCards.remove(firstPlayerCards.get(i));
                        secondPlayerCards.remove(secondPlayerCards.get(j));
                    }
                }
            }
            if(firstPlayerCards.isEmpty()){
                System.out.printf("Second player wins! Sum: %d",secondPlayerSum);
                break;
            }
            if(secondPlayerCards.isEmpty()){
                System.out.printf("First player wins! Sum: %d",firstPlayerSum);
                break;
            }
        }
    }
}
