class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0, j = n-1;
        int ni = numbers[i], nj = numbers[j];
        while(ni+nj != target){
            if(ni+nj < target){
                i++;
                ni = numbers[i];
            }else{
                j--;
                nj = numbers[j];
            }
        }
        i++;j++;
        int ret[] = {i, j};
        return ret;
    }
}
