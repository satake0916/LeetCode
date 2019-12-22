class Solution {
    public int removeDuplicates(int[] nums) {
        //iが遅い、jが早い
        int i = 0, j = 0;
        int n = nums.length;
        while(j < n){
            if(nums[i] == nums[j]){
                while(j<n && nums[i] == nums[j]){
                    j++;
                }
                i++;
            }else{
                nums[i] = nums[j];
            }
        }
        return i;
    }
}
