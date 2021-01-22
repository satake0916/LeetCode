class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        return Math.max(rob(nums, 0, n-1), rob(nums, 1, n));
    }
    
    private int rob(int[] nums, int start, int end){
        int[] dp = new int[end-start];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        
        for(int i = start+2, j = 2; i < end; i++, j++){
            dp[j] = Math.max(dp[j-1], dp[j-2]+nums[i]);
        }
        return dp[end-start-1];
    }
}
