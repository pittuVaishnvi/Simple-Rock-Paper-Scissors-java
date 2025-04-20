import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorr {
    public static void main(String[] args) {
        int userChoice, computerChoice, rock, paper, scissors;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        rock = 0;
        paper = 1;
        scissors = 2;

        String playAgain = "";

        do {
            System.out.println("ROCK - PAPER - SCISSORS GAME");
            System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
            userChoice = input.nextInt();
            computerChoice = rnd.nextInt(3);

            System.out.println("You choose: ");
            switch (userChoice) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissors");
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue; // Go to next round
            }

            System.out.println("Computer chose: ");
            switch (computerChoice) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissors");
                    break;
            }

            System.out.println("Here is the winner: ");
            if (userChoice == computerChoice) {
                System.out.println("It's a draw! Please play again.");
            } else if ((userChoice == 0 && computerChoice == 1) ||
                       (userChoice == 1 && computerChoice == 2) ||
                       (userChoice == 2 && computerChoice == 0)) {
                System.out.println("Oops! The computer won. Better luck next time");
            } else {
                System.out.println("Congratulations! You won!");
            }

            input.nextLine(); // consume the leftover newline

            while (true) {
                System.out.println("Wanna play again? Type 'yes' or 'no': ");
                playAgain = input.nextLine();
                if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }

        

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}
