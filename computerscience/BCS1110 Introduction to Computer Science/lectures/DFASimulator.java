public class DFASimulator {

    private static final int kNumStates = 4; // 4 states based on the table
    private static final int kNumSymbols = 2; // 2 symbols (0 and 1) based on the table

    private static final int[][] kTransitionTable = {
        {1, 0},
        {3, 2},
        {3, 0},
        {3, 3}
    };

    private static final boolean[] kAcceptTable = {
        true,
        false,
        false,
        true
    };

    public static boolean simulateDFA(String input) {
        int state = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            char ch = inputArray[i];
            if (ch != '0' && ch != '1') {
                throw new IllegalArgumentException("Invalid input symbol: " + ch);
            }
            state = kTransitionTable[state][ch - '0'];
        }
        return kAcceptTable[state];
    }

    public static void main(String[] args) {
        String testInput = "1011"; // Example input
        boolean isAccepted = simulateDFA(testInput);
        System.out.println("The input " + testInput + " is " + (isAccepted ? "accepted" : "rejected") + " by the DFA.");
    }
}
