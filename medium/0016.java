class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = nums[0] + nums[1] + nums[2];
        for(int i = 0, n = nums.length; i < n-2; i++){
            int temp = twoSumClosest(nums, i+1, target - nums[i]);
            ret = closeNum(ret, temp + nums[i], target);
        }
        return ret;
    }
    
    private int twoSumClosest(int[] nums, int index, int target){
        int ret = nums[index] + nums[index+1];
        int n = nums.length;
        int start = index, end = n - 1;
        while(start < end){
            ret = closeNum(ret, nums[start] + nums[end], target);
            if(nums[start] + nums[end] < target) start++;
            else if(nums[start] + nums[end] > target) end--;
            else break;
        }
        return ret;
    }
    
    private int closeNum(int a, int b, int target){
        if(Math.abs(a - target) < Math.abs(b - target)) return a;
        else return b;
    }
}
