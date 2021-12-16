package BasicSyntax;

import java.util.Scanner;

public class StudentsInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",studentName,age,grade);
    }
}
