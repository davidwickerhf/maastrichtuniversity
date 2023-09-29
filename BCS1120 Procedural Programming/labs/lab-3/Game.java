import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Year;
import java.io.IOException;
import java.net.URLEncoder;


/**
 * Jerry's Adventure Game
 * 
 * @author David Henry Francis Wicker
 * @param scanner
 * @param playerName
 * @param playerBirthYear
 * @param playerAge
 * @param playerAge
 * @param action 
 */
public class Game {

	// Formatting stuff
	private static final String ANSI_BROWN = "\u001B[33m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_GRAY = "\u001B[37m";
	private static final String ANSI_WHITE = "\u001B[97m";

	// Variables
	private static Scanner scanner;
	private static String playerName;
	private static int playerBirthYear;
	private static int playerAge;

	private static String action;
	private static int stateId;            

	// Action states
	public static final String OPENDOOR = "OPEN THE DOOR";
	public static final String GONORTH = "GO NORTH";
	public static final String GOEAST = "GO EAST";
	public static final String GOSOUTH = "GO SOUTH";
	public static final String GOWEST = "GO WEST";
	public static final String TAKEITEM = "TAKE ITEM";
	public static final String DROPITEM = "DROP ITEM";
	public static final String USEITEM = "USE ITEM";
	public static final String EXITGAME = "QUIT";


	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// Print ASCI-Art
		System.out.println(ANSI_BLUE + generateASCI("Jerry\'s Adventure") + ANSI_RESET);
		System.out.println("by: David Henry Francis Wicker");

		// Ask player name
		System.out.print(ANSI_GREEN + "\n\nWhat is your name?: " + ANSI_RESET);
		playerName = scanner.nextLine();
		System.out.printf("Hello %s!", playerName);

		// Ask player birth year
		System.out.print(ANSI_GREEN + "\n\nWhen were you born?: " + ANSI_RESET);
		playerBirthYear = Integer.parseInt(scanner.nextLine());

		// Calculate player age
		playerAge = calculateAge(playerBirthYear);
		System.out.printf("You are %d years old\n", playerAge);

		// Print out storyline
		System.out.println("\nBla bla for now");
		


		// Ask user input for action
		while (stateId != 666) {
			action = getInput();
			stateId = takeAction(action, stateId);
			printState(stateId);
		}

		scanner.close();
		
		// ----- Write your code above
	}

	/**
	 * Generate ASCI-Art through the api https://asciified.thelicato.io/
	 * Reference for HTTP Request: https://rapidapi.com/guides/make-api-call-java
	 * @param text
	 * @return printable and formatted ASCI-Art
	 */
	private static String generateASCI(String text) {
		String encodedText = encodeValue(text);
		String uriString = String.format("https://asciified.thelicato.io/api/v2/ascii?text=%s&font=Georgia11", encodedText);

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(uriString))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();

		HttpResponse<String> response = null;

		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return response.body();
	}

	/**
	 * Encode text to be placed into URL
	 * @param value Text to be encoded
	 * @return encoded URI parameter
	 */
	private static String encodeValue(String value) {
    	return URLEncoder.encode(value, StandardCharsets.UTF_16);
	}

	/**
	 * Calculate player's age based on the birth year and current year (not very precise)
	 * @param birthYear Year of birth of the player
	 * @return approximate age
	 */
	private static int calculateAge(int birthYear) {
		int year = Year.now().getValue();
		return year - birthYear;
	}


	/**
	 * Get input method
	 * @return user action
	 */
	public static String getInput() {
		String input = new String();
		
		boolean loopin = true;
		while (loopin) {
			// Ask for input
			
			System.out.print(ANSI_GREEN + "\n\nWhat would you like to do?: " + ANSI_RESET);
			input = scanner.nextLine();			
			input = input.toUpperCase(); // D.toLowerCase(null);

			// Validate input
			switch (input) {
				case OPENDOOR:
					System.out.println("Opening door...");
					loopin = false;
					break;
				case GONORTH:
					System.out.println("Going north...");
					loopin = false;
					break;
				case GOEAST: 
					System.out.println("Going east...");
					loopin = false;
					break;
				case GOSOUTH:
					System.out.println("Going south...");
					loopin = false;
					break;
				case GOWEST:
					System.out.println("Going west...");
					loopin = false;
					break;
				case TAKEITEM:
					System.out.println("Taking item..."); 
					loopin = false;
					break;
				case DROPITEM:
					System.out.println("Dropping item...");
					loopin = false;
					break;
				case USEITEM:
					System.out.println("Using item...");
					loopin = false;
					break;
				case EXITGAME:
					System.out.println("Quitting game...");
					loopin = false;
					break;
				default:
					System.out.println(ANSI_RED + "Invalid input" + ANSI_RESET); 
					loopin = false;
					continue;
			}

			// If input is valid, return action, else continue
			loopin = false;
		}
		return input;
	}

	/**
	 * Take action method
	 * @param action
	 * @param currentState
	 * @return new game state
	 */
	public static int takeAction(String action, int currentState) {
		if (action.equals(EXITGAME)) {
			return 666;
		}


		if (currentState == 0) {
			if (action.equals(OPENDOOR)) {
				return 1;
			} else if (action == TAKEITEM) {
				return 2;
			}
		} else if (currentState == 1) {
			if (action.equals(GOEAST)) {
				return 3;
			}
		}

		return currentState;
	}

	/**
	 * Prints state
	 * @param stateId
	 */
	public static void printState (int stateId) {
		switch (stateId) {
			case 0:
				System.out.println(ANSI_PURPLE + "You are standing in an abandoned university office. There are neither students nor teachers around you. There’s a table in front of you with various papers, pens, a small puzzle toy, and a calculator. A large window shows an empty office building; there are no Zombies in the empty building (as far as you can tell). Behind you is a dark and mysterious door that leads to a well-lit corridor with a fireproof ceiling and floor. You feel a sense of Wi-Fi around you, the grinding of an LCD operated coffee machine can be heard in the distance. You are not thirsty, but you rather have a craving for justice." + ANSI_RESET);
				break;
			case 1: 
				System.out.println(ANSI_PURPLE + "You are in a long hallway. There’s a man wearing glasses at the end of it, he looks harmless. West is a wall, east is the man, to the north is nothing but empty offices, a desperate sight. The carpeting in the hallway feels soft, you hear the clicking of a mouse in the distance. Your office is south (behind you)." + ANSI_RESET);
				break;
			case 2:
				System.out.println(ANSI_PURPLE + "You take the calculator from your desk. It’s a Casio FX-85gt Plus. The display shows the number 0.1134. You turn it upside down; now the Casio greets you with a friendly “hello”, nice. You hold the calculator in your hand." + ANSI_RESET);
				break;
			case 3: 
				System.out.println(ANSI_PURPLE + "The man greets you and starts endlessly talking to you about his children and his holiday to Benidorm. You die of boredom." + ANSI_RESET);
				break;
			case 666:
				break;
			default:
				break;
		}
	}

}