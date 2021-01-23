class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE/2);
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int index = binary_search(dp, nums[i]);
            dp[index] = nums[i];
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(dp[i] != Integer.MAX_VALUE/2) ans++;
            else break;
        }
        return ans;
    }
    
    private int binary_search(int[] nums, int key){
        int left = -1; //leftは常に条件を満たさない
        int right = nums.length; //rightは常に条件を満たす

        while(right - left > 1){
            int mid = (left + right) / 2;

            if(isOK(nums, mid, key)) right = mid;
            else left = mid;
        }

        /* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
        return right;
    }

    private boolean isOK(int[] nums, int index, int key){
        if(nums[index] >= key) return true;
        else return false;
    }
}
