import java.util.Scanner;

public class MoveToWizard {


    private static Scanner sc = new Scanner(System.in);
    static String input;

    public MoveToWizard() {

    }

    public static void MoveToWizard() {
        ;
        do {
            System.out.println("Make your choice:\n" +
                    "1: Buy Elexir\n" +
                    "2: Exit");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    buyElexir();
                    break;
                case "2":
                    break;

                default:
                    System.out.println("Incorrect command");
            }
        }
        while (!input.equals("2"));
    }

    private static void buyElexir() {

            System.out.println("You have got a elexir");

        }

    }




