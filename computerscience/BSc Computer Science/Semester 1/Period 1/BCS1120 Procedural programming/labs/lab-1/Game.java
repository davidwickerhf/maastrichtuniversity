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
		System.out.print("\nWhat would you like to do?: ");
		action = scanner.nextLine();
		System.out.print(action);

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
}