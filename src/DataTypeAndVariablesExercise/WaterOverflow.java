package DataTypeAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumLiters = 0;
        int waterTank = 255;
        for (int i = 1; i <= n; i++) {
            int currentQuantity = Integer.parseInt(scan.nextLine());
            if(sumLiters + currentQuantity <= waterTank){
                sumLiters+= currentQuantity;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumLiters);
    }
}
