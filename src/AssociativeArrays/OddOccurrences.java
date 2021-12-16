package AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if(!occurrences.containsKey(lowerCaseWord)){

                occurrences.put(lowerCaseWord, 1);
            }else {
                occurrences.put(lowerCaseWord, occurrences.get(lowerCaseWord) + 1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if(entry.getValue() % 2 == 1){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if(i < odds.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
