import java.util.ArrayList;
import java.util.Arrays;

// 2 Hole cards per player (hidden)
// 5 comminty cards per player (visible)

class Poker{
    static String[] deck = {"cA", "cK", "cQ", "cJ", "c10", "c9", "c8", "c7", "c6", "c5", "c4", "c3", "c2",  // Clovers
                          "pA", "pK", "pQ", "pJ", "p10", "p9", "p8", "p7", "p6", "p5", "p4", "p3", "p2",    // Pickes
                          "hA", "hK", "hQ", "hJ", "h10", "h9", "h8", "h7", "h6", "h5", "h4", "h3", "h2",    // Hearts
                          "dA", "dK", "dQ", "dJ", "d10", "d9", "d8", "d7", "d6", "d5", "d4", "d3", "d2"};   // Diamonds

    static String[][] player_combinations = new String[0][5];
    static String[][] opponent_combinations = new String[0][5];

    public static void main (String[] args) {
        String[] cards = {"c2", "c3", "c4", "c5", "c6", "c7"};
        Poker p = new Poker();      // This statement requires knowledge about Object-Oriented Programming (more in CS2)


        // Test combinatorics functions
        System.out.println(factorial(5));
        System.out.println(calculateCombinations(7, 5));

        // Example to validate your implementation of method deleteCards
        String[] discard = {"c4"};
        String[] newCards = p.discard_cards(cards, discard);
        System.out.println(Arrays.toString(newCards));
        // The following call must print the following combination (order of the elements inside the combination does not matter):
        //  "c2", "c3", "c5", "c6", "c7"

        // Example to validate your implementation of method possible_hands
        p.possible_hands(cards, new String[0]);
        // The following call must print the following combinations (order of combinations and/or elements inside the combinations do not matter):
        //  "c2", "c3", "c4", "c5", "c6"
        //  "c2", "c3", "c4", "c5", "c7"
        //  "c2", "c3", "c4", "c6", "c7"
        //  "c2", "c3", "c5", "c6", "c7"
        //  "c2", "c4", "c5", "c6", "c7"
        //  "c3", "c4", "c5", "c6", "c7"
        System.out.println(Arrays.deepToString(Poker.player_combinations));

        // Example to validate your implementation of method possible_hands_opponent
        String[] cardsOnCommunity = {"c2", "c3", "c4"};
        String[] cardsAvailable = {"c2", "c3", "c4", "c5", "c6", "c7"};
        p.possible_hands_opponent(cardsAvailable, cardsOnCommunity, new String[0]);
        // The following call must print the following combinations (order of combinations and/or elements inside the combinations do not matter):
        //  "c2", "c3", "c4", "c5", "c6"
        //  "c2", "c3", "c4", "c5", "c7"
        //  "c2", "c3", "c4", "c6", "c7"
        System.out.println(Arrays.deepToString(Poker.opponent_combinations));
        
    }

    public String[] discard_cards(String[] initialCards, String[] cardsToDiscard) {
        // Write your code below

        if (cardsToDiscard.length > 0) {
            ArrayList<String> cards = ArrayManipulation.Array2ArrayList(initialCards);
            cards.remove(cardsToDiscard[cardsToDiscard.length-1]);
            return discard_cards(ArrayManipulation.ArrayList2Array(cards), Arrays.copyOf(cardsToDiscard, cardsToDiscard.length-1));
        }
        return initialCards;

        // Write your code above
    }

    /**
     * you must implement a method that, given a set of cards cardsAvailable (initially 7 cards, 2 from the player's hand and the 5 community cards but it must accept any number of cards as input), calculates all the possible combinations of 5 cards in this set.
     * @param cardsAvailable
     * @param cardsOnHands
     */
    public void possible_hands (String[] cardsAvailable, String[] cardsOnHands) {

        int r = 5;
        int n = cardsAvailable.length;
        
        // Take n-r+1 elements



        // function combination:
        // pass in: inputArray, combinationArray, start, end, index, 5


        // BREAK CONDITION
        // if index is equal to 5:
        //  for each element in combinationArray:
        //      print each element
        //      return


        // for i = start:
        //  if i <=end and end -i+1 > r-index:
        //      combinationArray[index] = inputArray[i]
        //      call combination function again with updated parameter


        // Write your code below

        // Calculate number of possible combinations


        // int combs = calculateCombinations(cardsAvailable.length, 5);

        // if (player_combinations.length != combs) {
        //     // Keep calculating combinations

        //     // Recursive call
        // } 
        // All combinations found if this point is reached

        // Write your code above
    }


    /**
     * Given a number of items (n) and the number of items you want to choose at a time (k), 
     * calculate the number of possible combinations.
     * 
     * 
     * @apiNote Number of possible combinations must not exceede the maximum value storable in a Java Integer 
     * @param n number of items in the set
     * @param k number of items in each group
     * @return number of possible combinations of C(n, k) = n! / (k! * (n - k)!)
     */
    public static int calculateCombinations (int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n-k));
    }

    /**
     * Calculate the factorial of an integer (recursively)
     * @param n
     * @param res
     * @return Factorial value of n
     */
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n-1);
        }
        return n;
    }


    public void possible_hands_opponent (String[] cardsAvailable, String[] cardsOnCommunity, String[] cardsOnHands) {
        // Write your code below


        
        // Write your code above
    }

}