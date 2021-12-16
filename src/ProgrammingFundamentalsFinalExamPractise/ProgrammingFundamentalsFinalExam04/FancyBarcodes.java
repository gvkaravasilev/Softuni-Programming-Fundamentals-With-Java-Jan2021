package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int barcodesCount = Integer.parseInt(scan.nextLine());
        String barcodeRegex = "@#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(barcodeRegex);

        for (int i = 0; i < barcodesCount; i++) {
            String inputBarcodes = scan.nextLine();
            Matcher matcher = pattern.matcher(inputBarcodes);


            if (matcher.find()) {
                String product = matcher.group("product");
                String group = "";

                for (int j = 0; j <= product.length() - 1; j++) {
                    char currentSymbol = product.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        group += currentSymbol;
                    }
                }
                if (group.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
