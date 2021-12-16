package ObjectsAndClassesExercise.ArcticlesAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int articlesCount = Integer.parseInt(scan.nextLine());

        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < articlesCount; i++) {
            String input = scan.nextLine();

            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Article article = new Article(title, content, author);
            articleList.add(article);
        }
        String criteria = scan.nextLine();

        switch (criteria){
            case "title":

                articleList.stream().sorted((left, right) -> {
                    int result = left.getTitle().compareTo(right.getTitle());
                    return result;
                }).forEach(System.out::println);

                break;
            case "content":
                articleList.stream().sorted((left,right) -> {
                    int result = left.getContent().compareTo(right.getContent());
                    return result;
                }).forEach(System.out::println);
                break;
            case "author":
                articleList.stream().sorted((left, right) -> {
                    int result = left.getAuthor().compareTo(right.getAuthor());
                    return result;
                }).forEach(System.out::println);
                break;
        }
    }
}
