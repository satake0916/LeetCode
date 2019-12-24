class Solution {
    public int maxArea(int[] height) {
        return maxAreaRec(height, 0, height.length-1);
    }
    
    private int maxAreaRec(int[] height, int left, int right){
        if(left == right) return 0;
        if(height[left] < height[right]){
            return Math.max((right - left) * Math.min(height[left], height[right]), maxAreaRec(height, left+1, right));
        }
        if(height[left] > height[right]){
            return Math.max((right - left) * Math.min(height[left], height[right]), maxAreaRec(height, left, right-1));
        }
        if(height[left] == height[right]){
            return Math.max(Math.max((right - left) * Math.min(height[left], height[right]), maxAreaRec(height, left, right-1)), maxAreaRec(height, left+1, right));
        }          
        return -1;
    }
}
