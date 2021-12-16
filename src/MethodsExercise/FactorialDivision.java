package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        double division = getFactorial(a) / getFactorial(b);
        System.out.printf("%.2f",division);
    }
    public static Double getFactorial(int a){
        double factorial = 1;
        for (int i = 1; i <= a ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
