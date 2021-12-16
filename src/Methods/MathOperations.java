package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        switch (operator){
            case "+":
                System.out.printf("%.0f",Sum(a,b));
                break;
            case "-":
                System.out.printf("%.0f",Subtract(a,b));
                break;
            case "*":
                System.out.printf("%.0f",Multiply(a,b));
                break;
            case "/":
                System.out.printf("%.0f",Divide(a,b));
        }
    }
    public static double Sum(int a, int b){
        return a + b;
    }
    public static double Subtract(int a, int b){
        return a - b;
    }
    public static double Multiply(int a, int b){
        return a * b;
    }
    public static double Divide(int a, int b){
        return a / b;
    }
}
