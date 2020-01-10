class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ret[] = new int[2];
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(mp.containsKey(target - nums[i])){
                ret[0] = mp.get(target - nums[i]);
                ret[1] = i;
                break;
            }else{
                mp.put(nums[i], i);
            }
        }
        return ret;
    }
}
