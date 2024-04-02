> [!note] Overview
> Dynamic Programming (DP) is a technique for solving complex problems by breaking them down into simpler subproblems. It is used when the subproblems are not independent, i.e., the solution to one subproblem depends on the solutions of others. 
### Understanding Dynamic Programming:
#### Key Principles:
1. **Optimal Substructure**: A problem has an optimal substructure if its optimal solution can be constructed efficiently from optimal solutions of its subproblems.
2. **Overlapping Subproblems**: A problem has overlapping subproblems if finding its solution involves solving the same subproblem multiple times.

Dynamic programming is employed where recursive solutions could be inefficient due to the repetition of computations. DP saves these results in a table (memoization or tabulation) to prevent re-computation.

### The Knapsack Problem: A Classic DP Example

Let's explore a classic DP problem that showcases the utility of breaking down problems into subproblems.

- **Problem Statement**: You're a thief with a knapsack that can carry a certain weight. Given a list of items with their weights and values, determine the combination of items to steal that maximizes value without exceeding the weight capacity.

#### Simple Approach:
A naive approach is to try all combinations of items. This approach has a time complexity of \(O(2^n)\), making it impractical for a large number of items due to exponential growth in possibilities.

#### Dynamic Programming Approach:
1. **Start with a Grid**: Create a grid where rows represent items and columns represent weights up to the knapsack's capacity.
2. **Fill the Grid**: Each cell represents the maximum value attainable with the corresponding item and weight limit.
3. **Build from Subproblems**: Begin by solving smaller problems (sub-knapsacks) and use those solutions to address larger problems.

#### Example: 
Consider items with weights and values, and a knapsack capacity. Fill the grid cell by cell, deciding at each step whether to include the current item based on its value and weight, comparing with previous solutions to optimize the total value.

#### Implementation in Java
Here's a simplified Java code snippet for solving the knapsack problem using dynamic programming:

```java
public int knapsack(int W, int[] wt, int[] val, int n) {
    int[][] dp = new int[n + 1][W + 1];

    for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
            if (i == 0 || w == 0)
                dp[i][w] = 0;
            else if (wt[i - 1] <= w)
                dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
            else
                dp[i][w] = dp[i - 1][w];
        }
    }
    return dp[n][W];
}
```
#### Tips for Solving DP Problems:

- Start by identifying if the problem has optimal substructure and overlapping subproblems.
- Consider whether memoization (top-down) or tabulation (bottom-up) approach suits the problem better.
- Think about the state that represents a subproblem and how you can construct a solution to the problem from these states.
- - -

### Longest Common Subsequence (LCS) and Substring

The **longest common subsequence (LCS)** and **longest common substring** problems are two fundamental issues solved efficiently by dynamic programming. While they may sound similar, they address slightly different questions:

- **Longest Common Substring** focuses on finding the longest sequence of characters that appear in the same order within both strings. This problem does not allow for skipping characters in between matches within either string.
- **Longest Common Subsequence**, on the other hand, is more lenient, allowing characters to be skipped in the matching process, thus providing a broader scope for finding commonalities between two sequences.

#### Dynamic Programming Approach

Dynamic programming solves these problems by breaking them down into simpler, smaller problems (subproblems) and solving each one only once, storing their solutions in a table (typically a 2D array) to avoid recalculating them.

#### Longest Common Substring: Implementation Details

The goal here is to find the length of the longest substring shared between two strings. The DP table's cells represent the length of the longest common substring ending at character `i` in string 1 and character `j` in string 2. 

If `string1[i] == string2[j]`, the value in `dp[i][j]` is `dp[i-1][j-1] + 1`. Otherwise, it's `0`, as the substring can't continue if the current characters don't match.

#### Longest Common Subsequence: Implementation Details

For the LCS problem, if `string1[i] == string2[j]`, we also consider `dp[i-1][j-1] + 1`. However, if they don't match, we take the maximum of `dp[i-1][j]` or `dp[i][j-1]`, allowing for character skips and still maintaining a sequence.

#### Practical Applications

These concepts have broad applications:
- **LCS** can be used in bioinformatics for DNA sequence analysis, diff tools for file comparisons, and understanding textual changes.
- **Longest Common Substring** finds applications in search engines, plagiarism detection, and more.

#### Code Snippet for LCS

Here's how you might implement the LCS algorithm in Java:

```java
public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length(), n = text2.length();
    int[][] dp = new int[m+1][n+1];
    
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[m][n];
}
```

#### Final Thoughts on Dynamic Programming

Dynamic programming stands as a powerful strategy for solving optimization problems and those that can be broken down into interdependent subproblems. By understanding and applying DP concepts, you gain the ability to tackle a wide array of challenging computational problems more efficiently. The key to mastering DP lies in identifying the substructure of the problem, initializing the DP table correctly, and iteratively solving for increasingly larger subproblems while leveraging previously computed solutions.