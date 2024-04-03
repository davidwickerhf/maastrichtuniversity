import java.util.Map;
import java.util.HashMap;

public class DynamicProgramming {
    static Map<String, Double> probabilities;

    static class Position{
        int x;
        int y;
        String key;
        Position(int x, int y){
            this.x = x;
            this.y = y;
            key = x + "," + y;
        }
    }

    public static double probability(int x, int y, int currentSteps, int grid){
        if(currentSteps == 0)
            return 1d;
        Position pos = new Position(x, y);
        // if position has not been visited, calculate the probability of staying alive at said position
        if(!probabilities.containsKey(pos.key)){
            double prob = 0d;
            // break apart and solve the problem recursively by looking at each possible direction we can move in
            if(x > 0)
                prob += 0.25 * probability(x - 1, y, currentSteps - 1, grid);
            if(x < grid - 1)
                prob += 0.25 * probability(x + 1, y, currentSteps - 1, grid);
            if(y > 0)
                prob += 0.25 * probability(x, y - 1, currentSteps - 1, grid);
            if(y < grid - 1)
                prob += 0.25 * probability(x, y + 1, currentSteps - 1, grid);
            probabilities.put(pos.key, prob);
        }
        return probabilities.get(pos.key);
    }


    public static String findSolution(int x, int y, int maxSteps, int grid){
        probabilities = new HashMap<>(); // use a HashMap to store all results
        return "Alive probability is " + probability(x, y, maxSteps, grid);
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int maxSteps = 3;
        int gridSize = 3;
        System.out.println("Input: " + gridSize + " x " + gridSize + " matrix");
        System.out.println("Starting positions: ("+x+","+y+")");
        System.out.println("Number of steps: " + maxSteps);
        System.out.println(findSolution(x,y,maxSteps,gridSize));
    }
}
