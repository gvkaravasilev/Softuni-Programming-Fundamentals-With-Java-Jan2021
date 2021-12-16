package MiddExamPractise.ProgrammingFundamentals05MidExam;


import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dungeonRooms = scan.nextLine().split("\\|+");
        int initialHealth = 100;
        int initialBitcoins = 0;
        int bestRoomCount = 0;
        boolean madeIt = true;

        for (int i = 0; i < dungeonRooms.length; i++) {
            String[] tokens = dungeonRooms[i].split("\\s+");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);
            bestRoomCount++;

            switch (command){
                case "potion":
                    int currentHealth = initialHealth;
                    initialHealth += number;
                    if(initialHealth > 100){
                        initialHealth = 100;
                        int amount = 100 - currentHealth;
                        System.out.printf("You healed for %d hp.%n",amount);
                    }else {
                        System.out.printf("You healed for %d hp.%n",number);
                    }
                    System.out.printf("Current health: %d hp.%n",initialHealth);
                    break;
                case "chest":
                    initialBitcoins += number;
                    System.out.printf("You found %d bitcoins.%n",number);
                    break;
                default:
                    initialHealth -= number;
                    if(initialHealth > 0){
                        System.out.printf("You slayed %s.%n",tokens[0]);
                    }else{
                        System.out.printf("You died! Killed by %s.%n",tokens[0]);
                        System.out.printf("Best room: %d%n",bestRoomCount);
                        madeIt = false;
                    }
                    break;
            }
            if(!madeIt){
                break;
            }
        }
        if(madeIt){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",initialBitcoins);
            System.out.printf("Health: %d%n",initialHealth);
        }
    }
}
