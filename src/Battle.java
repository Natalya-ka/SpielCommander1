
import java.util.Scanner;


public class Battle {
    private static Scanner sc = new Scanner(System.in);

    public Battle(GameCharacter hero, GameCharacter monster, GameCharacter monster1) {
    }


    public static void Battle(GameCharacter hero, GameCharacter monster, GameCharacter monster1) {


        System.out.println(hero.name + "  Gets ambushed.Attacks him from the forest  " + monster.name + " " + monster1.name);

        System.out.println("The battle has begun");

        while (true) {
            System.out.println("  Hero turn:  " + hero.name);
            System.out.println(hero.name + "  What are your actions?");
            hero.reset();
            String input = sc.next();

            if (input.equals("bumpG")) {
                hero.attack(monster);
                if (monster.hp  <= 0 && monster1.hp>0 ) {
                    hero.getsGold();
                    System.out.println(hero.name + "   won   " + monster.name+
                                        " \nReward: " + hero.gold + "  gold");
                    monster.reset();
                }
            }
            if (input.equals("bumpT")) {
                hero.attack(monster1);
                if (monster1.hp  <= 0 && monster.hp>0) {
                    hero.getsGold();
                    System.out.println(hero.name + "   won   " + monster1.name+
                                        "\n Reward: " + hero.gold + "  gold");
                   monster1.reset();
                    //break;
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

                    System.out.println(monster.name + "    won    " + hero.name);

                    break;
                }
                if (hero.hp <= 0 && monster1.hp>0 && monster.hp<=0) {
                    System.out.println(monster1.name + "    won    " + hero.name);

                    break;
                }
            } else {
                monster.blockAction();
                monster1.blockAction();
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


