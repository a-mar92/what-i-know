import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Party party = new Party();

        boolean loop = true;

        while (loop) {

            System.out.println("options:");
            System.out.println("1 - show guest list");
            System.out.println("2 - add person");
            System.out.println("3 - show menu");
            System.out.println("4 - find gest by phone number ");
            System.out.println("0 - exit menu");
            System.out.println("put your option");


            try {
                int options = scanner.nextInt();

            switch (options) {
                case 1:
                    party.displayGuests();
                    break;
                case 2:
                    party.addUser();
                    break;
                case 3:
                    party.displayMeals();
                    break;
                case 4:
                    party.findGuestsByPhoneNumber();
                    break;
                case 5:
                    System.out.println("give me name5");
                    break;
                case 6:
                    party.displayGuests();
                    break;
                case 0:
                    loop = false;
                    System.out.println("exit");
                    break;}}
                catch (InputMismatchException e) {
                    System.out.println("Wrong number");
                    loop = false;
                }
            }
        }
    }





