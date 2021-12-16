package DataTypeAndVariables;

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbol = scan.nextLine().charAt(0);
        if(symbol >= 65 && symbol <= 90){
            System.out.println("upper-case");
        }else if(symbol >= 97 && symbol <= 122){
            System.out.println("lower-case");
        }

    }
}
