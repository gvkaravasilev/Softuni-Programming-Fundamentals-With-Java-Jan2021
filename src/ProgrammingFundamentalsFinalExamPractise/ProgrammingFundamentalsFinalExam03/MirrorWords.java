package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        String wordPairRegex = "(@|#)(?<firstWord>[A-za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(wordPairRegex);

        Matcher matcher = pattern.matcher(inputText);
        List<List<String>> wordPairs = new ArrayList<>();

        int pairsCounter = 0;
        while (matcher.find()){
            pairsCounter++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            StringBuilder firstWordReversed = new StringBuilder();
            StringBuilder secondWordReversed = new StringBuilder();

            for (int i = firstWord.length() - 1; i >= 0 ; i--) {
                char currentChar = firstWord.charAt(i);
                firstWordReversed.append(currentChar);
            }
            for (int i = secondWord.length() - 1; i >= 0 ; i--) {
                char currentChar = secondWord.charAt(i);
                secondWordReversed.append(currentChar);
            }
            if(secondWordReversed.toString().equals(firstWord) && firstWordReversed.toString().equals(secondWord)){
                wordPairs.add(List.of(firstWord, secondWord));
            }
        }
        if(pairsCounter == 0){
            System.out.println("No word pairs found!");
        }else{
            System.out.printf("%d word pairs found!%n",pairsCounter);
        }
        if(wordPairs.isEmpty()){
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            System.out.println(wordPairs.stream()
                    .map(pair -> String.join(" <=> ",pair))
                    .collect(Collectors.joining(", ")));
        }
    }
}
