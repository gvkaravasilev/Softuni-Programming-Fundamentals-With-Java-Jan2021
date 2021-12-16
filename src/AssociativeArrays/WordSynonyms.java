package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < commandsCount; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            if(!words.containsKey(word)){
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
