package ObjectsAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputArticle = scan.nextLine();
        String[] tokens = inputArticle.split(", ");
        String title = tokens[0];
        String content = tokens[1];
        String author = tokens[2];

        Article article = new Article(title, content, author);

        int commandsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String inputCommand = scan.nextLine();
            String command = inputCommand.split(": ")[0];
            String newData = inputCommand.split(": ")[1];

            switch (command){
                case "Edit":
                    article.edit(newData);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;
                case "Rename":
                    article.rename(newData);
                    break;
            }
        }
        System.out.println(article);
    }
}
