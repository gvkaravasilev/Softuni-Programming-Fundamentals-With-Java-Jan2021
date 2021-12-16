package BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int minutesAfter30 = minutes + 30;

        if(minutesAfter30 > 59){
            hours ++;
            if(hours > 23){
                hours -= 24;
            }
            minutesAfter30 -= 60;
        }
        if(minutesAfter30 < 10){
            System.out.printf("%d:%02d",hours,minutesAfter30);
        }else {
            System.out.printf("%d:%d",hours,minutesAfter30);
        }

    }
}
