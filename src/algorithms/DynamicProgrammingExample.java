package algorithms;

// Identify overlapping subproblems.
// Top-down
// Bottom-up // Fibonacci sequence
// recursion + caching // divide & conquer + memory.
// maximum/minimum, number of ways" / "count paths,"true/false" (decision)	Subset/Knapsack DP,"longest/shortest".
// LCS
public class DynamicProgrammingExample {
    int[] memo;

    public static void main(String[] args) {
        climbStairs();
    }

    public int climbStairs(int n) {
        memo = new int[n + 1];
        return helper(n);
    }

    private int helper(int n) {
        if (n <= 2) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = helper(n - 1) + helper(n - 2);
        return memo[n];
    }


    private static void climbStairs() {
        int n = 5;
        if (n <= 2) System.out.println(n);
        int a = 1; // dp[1]
        int b = 2; // dp[2]
        for (int i = 3; i <= n; i++) {
            int c = a + b; // dp[i] = dp[i-1] + dp[i-2]
            a = b;
            b = c;
        }
        System.out.println(b);
    }

}
