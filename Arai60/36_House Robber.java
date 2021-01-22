class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        
        int[][] dp = new int[3][n];
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        dp[2][1] = 0;
        
        for(int i = 2; i < n; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = Math.max(dp[0][i-1], dp[2][i-1]) + nums[i];
            dp[2][i] = dp[0][i-1];
        }
        
        return Math.max(dp[0][n-1], dp[1][n-1]);
    }
}
