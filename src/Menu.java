import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {

        GameCharacter hero = new GameCharacter("Knight", 10, 3, 1);
        GameCharacter monster = new GameCharacter("Goblin", 6, 1, 0);
        GameCharacter monster1 = new GameCharacter("Troll", 10, 1, 0);
        Battle battle = new Battle(hero, monster, monster1);
        battle.start();

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Press 1 to go the forest\n Press 2 to go the wizard \n Press 3 to Exit" +
                    "\nIn the forest make your choice: \nWrite 'bumpG' for Goblin attack .\nWrite 'bumpT' for Troll attack  \nWrite 'block' for blocked .");
            input = sc.nextLine();

            switch (input) {
                case "1":
                   Battle.Battle(hero, monster, monster1);
                    break;
                case "2":
                    MoveToWizard.MoveToWizard();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Incorrect command");
            }
        }

        while (!input.equals("3"));
    }

}