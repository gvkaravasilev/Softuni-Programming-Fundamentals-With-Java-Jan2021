package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pairsCount = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();


        for (int i = 0; i < pairsCount; i++) {
            String studentName = scan.nextLine();
            double currentGrade = Double.parseDouble(scan.nextLine());


            if(!studentInfo.containsKey(studentName)){
                studentInfo.put(studentName, new ArrayList<>());
            }
            studentInfo.get(studentName).add(currentGrade);
        }
        Map<String, Double> newInfo = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentInfo.entrySet()) {
            double average = entry.getValue().stream()
                    .mapToDouble(e -> e ).average()
                    .getAsDouble();

            if(average >= 4.50){
                newInfo.put(entry.getKey(), average);
            }
        }
        newInfo.entrySet().stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));
    }
}
