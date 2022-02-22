
import java.util.Scanner;


public class Battle {
    private static Scanner sc = new Scanner(System.in);

    public Battle(GameCharacter hero, GameCharacter monster, GameCharacter monster1) {
    }


    public static void Battle(GameCharacter hero, GameCharacter monster, GameCharacter monster1) {


        while (true) {
            System.out.println(hero.name + "  Gets ambushed.Attacks him from the forest  " + monster.name + " " + monster1.name);

            System.out.println("The battle has begun");
            System.out.println("  Hero turn:  " + hero.name);
            System.out.println(hero.name + "  What are your actions?");
            hero.reset();
            String input = sc.next();

            if (input.equals("bumpG")) {
                hero.attack(monster);
                if (monster.hp  <= 0 && monster1.hp>0 ) {
                    hero.getsGold();
                    hero.getExperience();
                    System.out.println(hero.name + "   won   " + monster.name+
                                        " \nReward: " + hero.gold + "  gold " + " and " + hero.experience+ " experience ");
                    monster.reset();
                }
            }
            if (input.equals("bumpT")) {
                hero.attack(monster1);
                if (monster1.hp  <= 0 && monster.hp>0) {
                    hero.getsGold();
                    hero.getExperience();
                    System.out.println(hero.name + "   won   " + monster1.name+
                                        "\n Reward: " + hero.gold + "  gold " + " and " + hero.experience+ " experience ");
                   monster1.reset();

                }
            }

            if (input.equals("block")) {
                hero.blockAction();
            }

            System.out.println("\n Monsters attack:  " );
            monster.reset();
            monster1.reset();
            if (Math.random() < 0.5) {
                monster.attack(hero);
                monster1.attack(hero);
                if (hero.hp <= 0 && monster.hp>0 && monster1.hp<=0) {
                    monster.getExperience();
                    System.out.println(monster.name + "    won    " + hero.name);
                    System.out.println(monster.name+ "have" + monster.experience);
                    break;
                }
                if (hero.hp <= 0 && monster1.hp>0 && monster.hp<=0) {
                    monster1.getExperience();
                    System.out.println(monster1.name + "    won    " + hero.name);
                    System.out.println(monster1.name+ "have" + monster.experience);
                    break;
                }
            } else {
                monster.blockAction();
                monster1.blockAction();
            }

            if (input.equals("exit")){
                break;
            }
        }

        System.out.println("!!!!!Game over!!!!!");
    }


    public void start() {
        run();
    }

    private void run() {
    }

}


