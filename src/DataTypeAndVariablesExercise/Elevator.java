package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int fullCourses = numberOfPeople / capacity;

        if(numberOfPeople % capacity != 0){
            fullCourses++;
        }
        System.out.println(fullCourses);
    }
}
