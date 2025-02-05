# Longest-Common-Subsequence-LCS-
Given two strings, text1 and text2, find the length of their longest common subsequence. A subsequence is a sequence that can be derived from one string by deleting some or no characters without changing the order of the remaining characters.
Explanation:
Dynamic Programming Table (dp):

dp[i][j] stores the length of the longest common subsequence between the first i characters of text1 and the first j characters of text2.
Transition:

If text1.charAt(i-1) == text2.charAt(j-1), then the character is part of the LCS, so increment the value from dp[i-1][j-1].
Otherwise, take the maximum between dp[i-1][j] and dp[i][j-1].
Result:

The value in dp[m][n] represents the length of the longest common subsequence for the entire strings.
