class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int n = S.length();
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = n-1; i >= 0; i--){
            if(S.charAt(i) == '-') continue;
            if(count == K){
                count = 0;
                sb.append('-');
            }
            sb.append(S.charAt(i));
            count++;
        }
        
        String ret = sb.reverse().toString().toUpperCase();
        return ret;
    }
}
