import java.util.Scanner;

public class LongestCommonSubsequence {

    // Function to compute the length of LCS using dynamic programming
    public static int lcs(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        // Create a DP table with dimensions (m+1) x (n+1)
        int[][] dp = new int[m + 1][n + 1];
        
        // Build the DP table bottom-up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters match, increment the count from the previous indices
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, take the maximum value from either excluding the current char from text1 or text2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // The bottom-right cell contains the length of the LCS
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two strings
        System.out.println("Enter the first string:");
        String text1 = scanner.nextLine();
        
        System.out.println("Enter the second string:");
        String text2 = scanner.nextLine();
        
        // Calculate the length of the longest common subsequence
        int result = lcs(text1, text2);
        System.out.println("Length of the Longest Common Subsequence: " + result);
        
        scanner.close();
    }
}
