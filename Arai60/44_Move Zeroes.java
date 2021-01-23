class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int index = i;
            while(index < n && nums[index] == 0){
                index++;
            }
            if(index == n) return;
            swap(nums, i, index);
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
