package MiddExamPractise.ProgrammingFundamentals04MidExam;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployerEfficiency = Integer.parseInt(scan.nextLine());
        int secondEmployerEfficiency = Integer.parseInt(scan.nextLine());
        int thirdEmployerEfficiency = Integer.parseInt(scan.nextLine());

        int peopleCount = Integer.parseInt(scan.nextLine());
        int totalPeopleToAnswerPerHour = firstEmployerEfficiency + secondEmployerEfficiency + thirdEmployerEfficiency;
        int hoursCount = 0;

        while(peopleCount > 0){
            peopleCount -= totalPeopleToAnswerPerHour;
            hoursCount++;
            if(hoursCount % 4 == 0){
                hoursCount++;
            }

        }
        System.out.printf("Time needed: %dh.",hoursCount);
    }
}
