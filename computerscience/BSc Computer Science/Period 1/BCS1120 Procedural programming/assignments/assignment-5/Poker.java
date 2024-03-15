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
     * You must implement a method that, given a set of cards cardsAvailable (initially 7 cards, 2 from the player's hand and the 5 community cards but it must accept any number of cards as input), calculates all the possible combinations of 5 cards in this set.
     * @param cardsAvailable
     * @param cardsOnHands
     */
    public void possible_hands (String[] cardsAvailable, String[] cardsOnHands) {

        // Breaking condition
        if (cardsOnHands.length == 5) {
            // Check if combination has already been found
            for (String[] comb : player_combinations) {
                ArrayList<String> listComb = ArrayManipulation.Array2ArrayList(comb);
                ArrayList<String> listCardsOnHands = ArrayManipulation.Array2ArrayList(cardsOnHands);
                listComb.sort(null);
                listCardsOnHands.sort(null);
                
                // Combination has already been found -> discard tree branch
                if (listComb.equals(listCardsOnHands)){
                    return;
                };
            }

            // Add combination to array
            player_combinations = ArrayManipulation.add_element_2Darray(player_combinations, cardsOnHands);
            return;
        }

        // For every available card, start a new recursion loop
        for (String card : cardsAvailable) {
            // Remove card from available cards (in new array)
            ArrayList<String> ncardsAvailable = ArrayManipulation.Array2ArrayList(cardsAvailable);
            ncardsAvailable.remove(card);



            // Add card to cards on hands (in new array)
            ArrayList<String> ncardsOnHand = ArrayManipulation.Array2ArrayList(cardsOnHands);
            ncardsOnHand.add(card);

            // Call recursion with updated arrays
            possible_hands(ArrayManipulation.ArrayList2Array(ncardsAvailable), ArrayManipulation.ArrayList2Array(ncardsOnHand));
        }
    }


    /**
     * 
     * @param cardsAvailable Cards available to opponent
     * @param cardsOnCommunity Oppnenet needs at least 3 cards crom the community cards
     * @param cardsOnHands Opponent's deck for recursive calling
     */
    public void possible_hands_opponent (String[] cardsAvailable, String[] cardsOnCommunity, String[] cardsOnHands) {
        ArrayList<String> listCardsAvailable = ArrayManipulation.Array2ArrayList(cardsAvailable);
        ArrayList<String> listCardsOnCommunity = ArrayManipulation.Array2ArrayList(cardsOnCommunity);
        ArrayList<String> listCardsOnHands = ArrayManipulation.Array2ArrayList(cardsOnHands);

        // Write your code below

        // Requirements -> need at least 3 cards from community cards

        // Breaking condition
        if (cardsOnHands.length == 5) {

            // Filter out combinations that do not have at least 3 community cards
            int count = 0;
            for (String card : cardsOnHands) {
                if (listCardsOnCommunity.contains(card)) {
                    count++;
                }
            }
            if (count < 3) {
                return;
            }


            // Check if combination has already been found
            for (String[] comb : opponent_combinations) {
                ArrayList<String> listComb = ArrayManipulation.Array2ArrayList(comb);
                listComb.sort(null);
                listCardsOnHands.
                sort(null);
                
                // Combination has already been found -> discard tree branch
                if (listComb.equals(listCardsOnHands)){
                    return;
                };
            }

            

            // Add combination to array
            opponent_combinations = ArrayManipulation.add_element_2Darray(opponent_combinations, cardsOnHands);
            return;
        }
        
        // For every available card, start a new recursion loop
        for (String card : cardsAvailable) {
            // Remove card from available cards (in new array)
            // ArrayList<String> ncardsAvailable = ArrayManipulation.Array2ArrayList(cardsAvailable);
            listCardsAvailable.remove(card);


            // Add card to cards on hands (in new array)
            ArrayList<String> ncardsOnHand = ArrayManipulation.Array2ArrayList(cardsOnHands);
            ncardsOnHand.add(card);            

            // Call recursion with updated arrays
            possible_hands_opponent(ArrayManipulation.ArrayList2Array(listCardsAvailable), cardsOnCommunity, ArrayManipulation.ArrayList2Array(ncardsOnHand));
        }

        // Write your code above
    }

}