class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        var x = new ArrayList<Integer>();
        var y = new ArrayList<Integer>();
        for(int num: nums) y.add(num);
        rec(ans, x, y);
        return ans;
    }
    
    private void rec(List<List<Integer>> ans, List<Integer> cur, List<Integer> nums){
        if(nums.size() == 0){
            ans.add(cur);
        }
        for(int i = 0; i < nums.size(); i++){
            var next = new ArrayList<>(cur);
            next.add(nums.get(i));
            var next_nums = new ArrayList<>(nums);
            next_nums.remove(i);
            rec(ans, next, next_nums);
        }
    }
}

