package MiddExamPractise.ProgrammingFundamentals02MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scan.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scan.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scan.nextLine());

        int studentsCount = Integer.parseInt(scan.nextLine());
        int totalEmployeeHoursToHandle = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int hoursCount = 0;

        while (studentsCount > 0){
            studentsCount -= totalEmployeeHoursToHandle;
            hoursCount++;
            if(hoursCount % 4 == 0){
                hoursCount++;
            }
        }
        System.out.printf("Time needed: %dh.",hoursCount);
    }
}
