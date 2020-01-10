class NumArray {
    
    private List<Integer> sums = new ArrayList<>();

    public NumArray(int[] nums) {
        if(nums.length == 0) return;
        sums.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            sums.add(nums[i] + sums.get(i-1));
        }
    }
    
    public int sumRange(int i, int j) {
        if(i == 0) return sums.get(j);
        else return sums.get(j) - sums.get(i-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
