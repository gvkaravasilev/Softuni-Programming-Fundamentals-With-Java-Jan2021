package ProgrammingFundamentalsFinalExamPractise.ProgrammingFundamentalsFinalExam04;

import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int heroesNumber = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> heroStats = new LinkedHashMap<>();

        for (int i = 0; i < heroesNumber; i++) {
            String inputHeroes = scan.nextLine();
            String[] tokens = inputHeroes.split("\\s+");

            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            if (hp <= 100 && mp <= 200) {
                heroStats.put(heroName, Arrays.asList(hp, mp));
            }
        }

        String commandsInput = scan.nextLine();

        while (!commandsInput.equals("End")) {

            String[] commandParts = commandsInput.split(" - ");
            String command = commandParts[0];
            String heroName = commandParts[1];

            switch (command) {

                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];

                    int currentMp = heroStats.get(heroName).get(1);

                    if (currentMp >= mpNeeded) {
                        currentMp -= mpNeeded;
                        heroStats.get(heroName).set(1, currentMp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }

                    break;
                case "TakeDamage":

                    int damageMade = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    int currentHp = heroStats.get(heroName).get(0);
                    currentHp -= damageMade;

                    heroStats.get(heroName).set(0, currentHp);

                    if(currentHp > 0 ){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damageMade,attacker,currentHp);
                    }else{
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                        heroStats.remove(heroName);
                    }

                    break;
                case "Recharge":

                    int amount = Integer.parseInt(commandParts[2]);
                    int mpPointsBeforeRecharging = heroStats.get(heroName).get(1);
                    int currentMpPoints = heroStats.get(heroName).get(1);

                    currentMpPoints += amount;
                    if(currentMpPoints > 200){
                        currentMpPoints = 200;
                    }

                    heroStats.get(heroName).set(1, currentMpPoints);
                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMpPoints - mpPointsBeforeRecharging);
                    break;

                case "Heal":

                    int hpToHeal = Integer.parseInt(commandParts[2]);
                    int hpBeforeHealing = heroStats.get(heroName).get(0);
                    int currentHpPoints = heroStats.get(heroName).get(0);

                    currentHpPoints += hpToHeal;

                    if(currentHpPoints > 100){
                        currentHpPoints = 100;
                    }

                    heroStats.get(heroName).set(0, currentHpPoints);

                    System.out.printf("%s healed for %d HP!%n", heroName, currentHpPoints - hpBeforeHealing);
                    break;


            }


            commandsInput = scan.nextLine();
        }
        heroStats.entrySet().stream()
                .sorted((left, right) ->{
                    int result = right.getValue().get(0).compareTo(left.getValue().get(0));
                    if(result == 0){
                        result = left.getKey().compareTo(right.getKey());
                    }
                    return result;
                }).forEach(hero -> {
            System.out.println(hero.getKey());
            System.out.printf("  HP: %d%n",hero.getValue().get(0));
            System.out.printf("  MP: %d%n",hero.getValue().get(1));
        });
    }
}
