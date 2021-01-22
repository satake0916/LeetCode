class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0;
        int sum = 0, count = 0;
        int ans = nums.length;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum < s){
            return 0;
        }
        sum = 0;
        
        while(right < nums.length){
            sum += nums[right];
            right++;
            count++;
            if(sum < s){
                continue;
            }
            while(sum >= s){
                ans = Math.min(ans, count);
                sum -= nums[left];
                left++;
                count--;
            }
        }
        return ans;
    }
}
