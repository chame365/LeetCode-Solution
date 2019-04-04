package problem;

public class P070 {
    public static void main(String[] args) {
        new P070().climbStairs(44);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2){
                dp[i] = i;
            }
            else{
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}
