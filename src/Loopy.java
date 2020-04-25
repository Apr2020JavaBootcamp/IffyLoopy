import java.util.Scanner;

public class Loopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char programID;

        System.out.println("Which program would you like to run?\n" +
                "Enter '1' for Five Words\n" +
                "Enter '2' for Red Eyes\n" +
                "Enter any other key to quit.");

        programID = input.next().charAt(0);

        if (programID == '1') {
            fiveWords();
        } else if (programID == '2') {
            checkRedEyes();;
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static void fiveWords() {
        Scanner input = new Scanner(System.in);
        String concatWords = "";
        System.out.println("Welcome to Five Words.");

        for (int i = 0; i < 5; i += 1) {
            System.out.println("Enter a word:");
            String word = input.nextLine();
            concatWords = concatWords + word + " ";
        }

        System.out.println("You entered: " + concatWords);
    }

    public static void checkRedEyes() {
        Scanner input = new Scanner (System.in);
        char response;
        boolean redEyes = false;

        System.out.println("Welcome to Red Eyes.");

        do {
            System.out.println("Are your eyes red? " +
                    "Enter 'y' or 'n'.");
            response = input.next().charAt(0);

            if (response == 'y') {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }

            System.out.println("Do you want to try again?\n" +
                    "Enter 'y' or 'n'.");

            response = input.next().charAt(0);

        } while (response != 'n');
    }
}
