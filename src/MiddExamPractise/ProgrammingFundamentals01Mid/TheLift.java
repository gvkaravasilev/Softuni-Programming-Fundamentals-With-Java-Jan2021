package MiddExamPractise.ProgrammingFundamentals01Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scan.nextLine());

        List<Integer> currentState = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = 4;
        int sum = 0;
        for (int i = 0; i < currentState.size(); i++) {
            int currentWagon = currentState.get(i);
            if(currentWagon < 4){
                sum = maxCapacity - currentWagon;
                if(sum <= peopleWaiting ){
                    currentState.set(i, currentWagon + sum);
                }else if(peopleWaiting > 0){
                    currentState.set(i,currentWagon + peopleWaiting);
                }
            }


            peopleWaiting -= sum;
        }
    }
}

