package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        if(command.equals("int")){
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            System.out.println(getMax(a,b));
        }else if(command.equals("char")){
            char firstSymbol = scan.nextLine().charAt(0);
            char secondSymbol = scan.nextLine().charAt(0);
            System.out.println(getMax(firstSymbol,secondSymbol));
        }else if(command.equals("string")){
            String firstString = scan.nextLine();
            String secondString = scan.nextLine();
            System.out.println(getMax(firstString,secondString));
        }
    }
    public static Integer getMax(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static Character getMax(char firstSymbol, char secondSymbol){
        if(firstSymbol > secondSymbol){
            return firstSymbol;
        }
        return secondSymbol;
    }
    public static String getMax(String firstString, String secondString){
        if(firstString.compareTo(secondString) >= 0){
            return firstString;
        }
        return secondString;
    }
}
