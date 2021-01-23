class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for(int w: weights){
            right += w;
            left = Math.max(left, w);
        }
        left--;
        
        while(right - left > 1){
            int mid = (left + right) / 2;
            if(days(weights, mid) <= D) right = mid;
            else left = mid;
        }
        
        return right;
        
    }
    
    private int days(int[] weights, int capacity){
        int day = 1, cur = 0;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] <= capacity - cur){
                cur += weights[i];
            }else{
                day++;
                cur = weights[i];
            }
        }
        return day;
    }
}
