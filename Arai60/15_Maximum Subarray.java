/*
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n+1];
        Arrays.fill(sum, 0);
        for(int i = 1; i < n+1; i++){
            sum[i] = sum[i-1]+nums[i-1];
        }
        int ans = Integer.MIN_VALUE;
        int minsum = 0;
        for(int i = 1; i < n+1; i++){
            ans = Math.max(ans, sum[i] - minsum);
            minsum = Math.min(minsum, sum[i]);
        }
        return ans;
    }
}
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0], cur = 0;
        
        for(int num: nums){
            if(cur < 0) cur=0;
            cur += num;
            ans = Math.max(ans, cur);
        }
        
        return ans;
    }
}
