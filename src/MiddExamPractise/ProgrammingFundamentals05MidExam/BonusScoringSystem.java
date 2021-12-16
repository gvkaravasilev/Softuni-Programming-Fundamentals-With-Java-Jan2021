package MiddExamPractise.ProgrammingFundamentals05MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scan.nextLine());
        int lecturesCount = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());
        double maxBonus = Double.MIN_VALUE;
        double  maxAttendances = Double.MIN_VALUE;


        for (int i = 0; i < studentsCount; i++) {
            double  studentAttendances = Integer.parseInt(scan.nextLine());
            double currentBonus = (studentAttendances / lecturesCount) * (5 + initialBonus);
            if(currentBonus > maxBonus){
                maxBonus = currentBonus;
                maxAttendances = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n",Math.round(maxBonus));
        System.out.printf("The student has attended %d lectures.",(int)maxAttendances);

    }
}
