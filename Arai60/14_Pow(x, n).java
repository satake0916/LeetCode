class Solution {    
    public double myPow(double x, int n) {
        return rec(n>0, x, n);
    }
    
    private double rec(boolean sign, double x, int n){
        if(n==0) return 1;
        
        double t = rec(sign, x, n/2);
        if(n%2 == 0) return 
        else return (sign ? t*t*x : t*t/x);
    }
}
