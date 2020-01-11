class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n>10) n=10;
        if(n == 0) return 1;
        int ret = 10;
        for(int i = 2; i < n+1; i++){
            int last = 9-i+2;
            int t = 9;
            for(int j = 9; j >= last; j--) t *= j;
            ret += t;
        }
        return ret;
    }
}
