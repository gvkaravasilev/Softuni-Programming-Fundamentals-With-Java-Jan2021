package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scan.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName,lastName,age,city);
            students.add(student);


            input = scan.nextLine();
        }
        String cityName = scan.nextLine();

        for (Student student : students) {
            if(student.getCity().equals(cityName)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
