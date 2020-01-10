class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int ret[] = new int[n];
        if(k > n) k %= n;
        for(int i = 0; i < n; i++){
            if(i+k<n) ret[i+k] = nums[i];
            else ret[i+k-n] = nums[i];
        }
        for(int i = 0; i < n; i++) nums[i] = ret[i];
    }
}
