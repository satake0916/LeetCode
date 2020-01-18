class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ret[] = {-1, -1};
        if(nums.length == 0) return ret;
        ret[0] = lower_bound(nums, target);
        ret[1] = upper_bound(nums, target);
        if(nums[ret[0]] != target){
            ret[0] = -1;
            ret[1] = -1;
        }
        return ret;
    }
    
    private int lower_bound(int[] nums, int target){
        if(nums[0] == target) return 0;
        int left = 0, right = nums.length-1;
        int mid = -1;
        while(right - left > 1){
            mid = (left + right) / 2;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;
    }
    
    private int upper_bound(int[] nums, int target){
        if(nums[nums.length - 1] == target) return nums.length-1;
        int left = 0, right = nums.length-1;
        int mid = -1;
        while(right - left > 1){
            mid = (left + right) / 2;
            if(nums[mid] > target){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }
}
