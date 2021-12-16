package ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personInput = scan.nextLine();

            String name = personInput.split("\\s+")[0];
            int age = Integer.parseInt(personInput.split("\\s+")[1]);
            Person person = new Person(name, age);
            personList.add(person);
        }
        personList.stream().filter(person -> person.getAge() > 30)
                .sorted((left, right) -> {
                    int result = left.getName().compareTo(right.getName());
                    return result;
                }).forEach(System.out::println);

    }
}
