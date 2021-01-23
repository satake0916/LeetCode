class Solution {
    public int kthGrammar(int N, int K) {
        if(N==1){
            if(K==1) return 0;
            else return 1;
        }
        
        if(K%2 == 1){
            return kthGrammar(N-1, K/2+1);
        }else{
            return 1 - kthGrammar(N-1, K/2);
        }
    }
}
