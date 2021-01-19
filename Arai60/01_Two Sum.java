class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int rest = target - nums[i];
            if(mp.get(rest) == null){
                mp.put(nums[i], i);
            }else{
                return new int[]{mp.get(rest), i};
            }
        }
        return new int[]{};
    }
}
