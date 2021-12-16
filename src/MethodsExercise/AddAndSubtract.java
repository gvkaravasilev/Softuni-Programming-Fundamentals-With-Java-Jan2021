package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int sum = getSum(a,b);
        int result = getSubtraction(sum,c);
        System.out.println(result);

    }

    public static Integer getSum(int a, int b) {
        return a + b;
    }

    public static Integer getSubtraction(int b, int c) {
        return b - c;
    }
}
