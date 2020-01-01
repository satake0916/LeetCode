class Solution {
    public int reverse(int x) {
        long ret = 0;
        while(x != 0){
            ret *= 10;
            ret += x%10;
            x /= 10;
        }
        if(ret > Math.pow(2,31)-1 || ret < -1 * Math.pow(2,31)) ret = 0;
        return (int)ret;
    }
}
