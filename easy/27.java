class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0, j = n-1, count = 0;
        while(i <= j){
            if(nums[i] == val){
                nums[i] = nums[j];
                nums[j] = val;
                j--;
                count++;
            }else{
                i++;
            }
        }
        return n-count;
    }
}
