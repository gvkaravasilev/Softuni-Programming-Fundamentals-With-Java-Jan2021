package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        if (command.equals("add")) {
            System.out.println(add(a,b));
        } else if (command.equals("subtract")) {
            System.out.println(subtract(a,b));
        } else if (command.equals("multiply")) {
            System.out.println(multiply(a,b));
        }else if(command.equals("divide")){
            System.out.println(divide(a,b));
        }

    }

    public static Integer add(int a, int b) {
        return a + b;
    }

    public static Integer multiply(int a, int b) {
        return a * b;
    }

    public static Integer subtract(int a, int b) {
        return a - b;
    }

    public static Integer divide(int a, int b) {
        return a / b;
    }
}
