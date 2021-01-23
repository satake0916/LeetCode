class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE/2);
        dp[0] = 0;
        
        for(int i = 0; i < coins.length; i++){
            for(int j = 0; j < amount+1; j++){
                if(j - coins[i] >= 0 && dp[j - coins[i]] != Integer.MAX_VALUE/2){
                    dp[j] = Math.min(dp[j - coins[i]]+1, dp[j]);
                }
            }
        }
        
        return (dp[amount] != Integer.MAX_VALUE/2) ? dp[amount] : -1;
    }
}
