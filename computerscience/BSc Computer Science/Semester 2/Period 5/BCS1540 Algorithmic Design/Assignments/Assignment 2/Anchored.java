import java.util.Scanner;

import java.io.*;
import java.io.File;

/*
 * Class to compute the length of the longest (anchored) common subsequence between two strings.
 * @author David Henry Francis Wicker
 */
public class Anchored {

  /*
   * Main method to read input from a file and call the lacs method.
   * 
   * @param args The command line arguments
   * 
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    String filename = scanner.nextLine();
    File infile = new File(filename);
    Scanner input = new Scanner(infile);

    String s1, s2;
    s1 = input.nextLine();
    s2 = input.nextLine();

    // Implementation (using dynamic programming table)
    int result = lacs(s1, s2);

    System.out.println(result);

    input.close();
    scanner.close();
  }

  /*
   * Method to compute the length of the longest (anchored) common subsequence
   * between two strings.
   * 
   * @param s1 The first string
   * 
   * @param s2 The second string
   */
  public static int lacs(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();

    // Create a 2D array to store lengths of longest (anchored) common subsequence
    int[][] dp = new int[m + 1][n + 1];

    // Build the dp array
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0; // Initialize the boundaries to be all zeros
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1; // Characters match
        } else if (s1.charAt(i - 1) == '*') {
          // Keep the value of the cell to the left if the * is in the first string
          dp[i][j] = dp[i][j - 1];
        } else if (s2.charAt(j - 1) == '*') {
          // Keep the value of the cell above if the * is in the second string
          dp[i][j] = dp[i - 1][j];
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Choose the max of left or top
        }
      }
    }

    return dp[m][n]; // The bottom-right corner will have the result
  }
}
