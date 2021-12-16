package ObjectsAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < studentsCount; i++) {
            String studentsInput = scan.nextLine();

            String firstName = studentsInput.split("\\s+")[0];
            String lastName = studentsInput.split("\\s+")[1];
            double grade = Double.parseDouble(studentsInput.split("\\s+")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        studentList.stream().sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList())
                .forEach(student -> System.out.printf("%s%n",student));
    }
}
