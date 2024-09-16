import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"Rock", "Paper", "Scissors"};
        
        while (true) {
            System.out.println("Enter your choice (Rock, Paper, Scissors). To exit the game, type 'exit':");
            String userChoice = scanner.nextLine();
            
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            // Check if the user input is valid
            boolean validInput = false;
            for (String option : options) {
                if (option.equalsIgnoreCase(userChoice)) {
                    validInput = true;
                    break;
                }
            }
            
            if (!validInput) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            
            // Generate the computer's choice
            int computerChoiceIndex = random.nextInt(options.length);
            String computerChoice = options[computerChoiceIndex];
            System.out.println("Computer chose: " + computerChoice);
            
            // Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        scanner.close();
    }
}
