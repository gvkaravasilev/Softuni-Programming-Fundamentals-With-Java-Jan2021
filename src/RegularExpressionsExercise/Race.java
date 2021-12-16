package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> racers = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        String regexName = "[A-Za-z]+";
        String regexDistance = "\\d";

        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);

        Map<String, Integer> racerDistance = new LinkedHashMap<>();

        racers.forEach(racer -> racerDistance.put(racer, 0));

        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher nameMatcher = patternName.matcher(input);

            while (nameMatcher.find()) {
                nameBuilder.append(nameMatcher.group());
            }

            String name = nameBuilder.toString();

            int sumDistance = 0;
            Matcher distanceMatcher = patternDistance.matcher(input);

            while (distanceMatcher.find()){
                sumDistance += Integer.parseInt(distanceMatcher.group());
            }

            if(racerDistance.containsKey(name)){
                racerDistance.put(name, racerDistance.get(name) + sumDistance);
            }

            input = scan.nextLine();
        }
        List<String> firstThree = racerDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
