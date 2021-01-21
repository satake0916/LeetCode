class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(ans, nums, 0, new ArrayList<Integer>());
        return ans;
    }
    
    private void rec(List<List<Integer>> ans, int[] nums, int index, List<Integer> cur){
        if(index == nums.length){
            ans.add(cur);
            return;
        }
        rec(ans, nums, index+1, cur);
        var t = new ArrayList<Integer>(cur);
        t.add(nums[index]);
        rec(ans, nums, index+1, t);
    }
}
