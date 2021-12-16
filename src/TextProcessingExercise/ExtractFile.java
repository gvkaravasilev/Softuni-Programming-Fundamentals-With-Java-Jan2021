package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] fileDirectoryItems = input.split("\\\\");

        String fileNameAndExtension = fileDirectoryItems[fileDirectoryItems.length - 1];
        String fileName = fileNameAndExtension.split("\\.")[0];
        String extension = fileNameAndExtension.split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",extension);

    }
}
