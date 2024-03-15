import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Arrays;

public class RPSLO {

    // Rock = 0, Paper = 1, Scissors = 2, Lizzard = 3, Spock = 4
    // Scissors cut Paper
    // Paper covers Rock
    // Rock crushes Lizard
    // Lizard poisons Spock
    // Spock smashes Scissors
    // Scissors decapitate Lizard
    // Lizard eats Paper
    // Paper disproves Spock
    // Spock vaporizes Rock
    // Rock crushes Scissors

    enum Plays {
        S,
        P,
        R,
        L,
        O,
    }

    private static Plays userMove;
    private static Plays computerMove;
    private static final HashMap<Plays, Plays[]> playsMap = new HashMap<Plays, Plays[]>();

    public static void main(String[] args) {

        // Initialize
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Load moves map
        playsMap.put(Plays.S, new Plays[]{Plays.P, Plays.L});
        playsMap.put(Plays.P, new Plays[]{Plays.R, Plays.O});
        playsMap.put(Plays.R, new Plays[]{Plays.L, Plays.S});
        playsMap.put(Plays.L, new Plays[]{Plays.P, Plays.O});
        playsMap.put(Plays.O, new Plays[]{Plays.R, Plays.S});
        
        // Write your code below

        // Get user input9
        System.out.println("Enter your play: R, P, S, L, O");
        try {
            userMove = Enum.valueOf(Plays.class, scanner.nextLine().toUpperCase());
        } catch (Exception e) {
            System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
            scanner.close();
            return;
        }

        // Choose random computer move
        computerMove = Plays.values()[random.nextInt(5)];
        System.out.printf("Computer play is %s", computerMove.toString());

        // Check the winner
        if (computerMove == userMove) {
            // Tie
            System.out.println("\nIt is a tie!");
        } else if (Arrays.asList(playsMap.get(computerMove)).contains(userMove)) {
            // Computer wins
            System.out.println("\nComputer wins!");
        } else {
            // User wins
            System.out.println("\nYou win!");
        }

        scanner.close();
        // Write your code above
    }
}
