package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.print(printString(input,n));
    }
    public static StringBuilder printString(String input, int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(input);
        }
        return result;
    }
}
