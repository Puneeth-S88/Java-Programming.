import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock Paper Scissors Game!");
        System.out.println("Enter your choice (0 = Rock, 1 = Paper, 2 = Scissors): ");

        int userChoice = sc.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice!");
            return;
        }

        int computerChoice = rand.nextInt(3);

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Game logic
        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}