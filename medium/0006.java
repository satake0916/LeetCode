class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        String ret = "";
        for(int i = 0; i < numRows; i++){
            if(i == 0 || i == numRows-1){
                int j = i;
                while(j < n){
                    ret += s.charAt(j);
                    if(numRows == 1) j++;
                    else j += (numRows - 1) * 2;
                } 
            }else{
                int j = i;
                while(j < n){
                    ret += s.charAt(j);
                    j += (numRows - i - 1) * 2;
                    if(j >= n) break;
                    ret += s.charAt(j);
                    j += i * 2;
                }
            }
        }
        return ret;
    }
}
