class Solution{
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        rec(ans, new ArrayList<>(), candidates, 0, target);
        return ans;
    }
    
    private void rec(List<List<Integer>> ans, List<Integer> cur, int[] nums, int now, int rest){
        if(rest == 0){
            ans.add(cur);
            return;
        }
        
        if(rest < 0 || now >= nums.length){
            return;
        }
        
        if(nums[now] <= rest){
            List<Integer> next = new ArrayList<>(cur);
            next.add(nums[now]);
            rec(ans, next, nums, now, rest-nums[now]);
        }
        rec(ans, cur, nums, now+1, rest);
    }
}
