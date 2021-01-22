class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int left = 0, right = nums.length-1;
        if(nums[right] > nums[0]) return nums[0];
        
        while(right - left > 1){
            int mid = (left + right) / 2;        
            if(nums[mid] > nums[left]) left = mid;
            else right = mid;
        }
        
        return nums[right];
    }
}
