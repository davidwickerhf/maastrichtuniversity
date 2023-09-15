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
	private static Scanner scanner;
	private static String playerName;
	private static int playerBirthYear;
	private static int playerAge;
	private static String action;

	// Action states
	public static final String OPENDOOR = "OPEN THE DOOR";
	public static final String GONORTH = "GO NORTH";
	public static final String GOEAST = "GO EAST";
	public static final String GOSOUTH = "GO SOUTH";
	public static final String GOWEST = "GO WEST";
	public static final String TAKEITEM = "TAKE ITEM";
	public static final String DROPITEM = "DROP ITEM";
	public static final String USEITEM = "USE ITEM";
	public static final String EXITGAME = "EXIT GAME";


	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// Print ASCI-Art
		System.out.println(generateASCI("Jerry\'s Adventure"));
		System.out.println("by: David Henry Francis Wicker");

		// Ask player name
		System.out.print("\n\nWhat is your name?: ");
		playerName = scanner.next();
		System.out.printf("Hello %s!", playerName);

		// Ask player birth year
		System.out.print("\n\nWhen were you born?: ");
		playerBirthYear = scanner.nextInt();
		scanner.nextLine();

		// Calculate player age
		playerAge = calculateAge(playerBirthYear);
		System.out.printf("You are %d years old\n", playerAge);

		// Print out storyline
		System.out.println("\nBla bla for now");

		// Ask user input for action
		while (true) {
			String action = getInput();
			if ( action == EXITGAME) {
				break;
			}
		}
		

		// Press enter to close program
		System.out.println("\n\nPress enter to close the program...");
		scanner.nextLine();
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

	public static String getInput() {

		Scanner scanner = new Scanner(System.in);
		String input = new String();
		
		boolean loopin = true;
		while (loopin) {
			// Ask for input
			System.out.print("\nWhat would you like to do?: ");
			input = scanner.nextLine();
			input = input.toUpperCase(); // .toLowerCase(null);

			// Validate input
			switch (input) {
				case OPENDOOR:
					System.out.println("Opening door...");
					loopin = false;
					break;
				case GONORTH:
					System.out.println("Going nirth...");
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
					System.out.println("Invalid input");
					loopin = false;
					continue;
			}

			// If input is valid, return action, else continue
			loopin = false;
		}
		
		scanner.close();
		return input;
	}
}