/*
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        String strs[] = new String[numRows];
        for(int i = 0; i < numRows; i++) strs[i] = "";
        
        int currRow = 0;
        boolean dir = true;
        for(int i = 0; i < s.length(); i++){
            strs[currRow] += s.charAt(i);
            if(dir){
                if(currRow == numRows - 1){
                    dir = false;
                    currRow--;
                }else{
                    currRow++;
                }
            }else{
                if(currRow == 0){
                    dir = true;
                    currRow++;
                }else{
                    currRow--;
                }
            }
        }
        
        String ans = "";
        for(int i = 0; i < numRows; i++){
            ans += strs[i];
        }
        
        return ans;
    }
}
*/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        StringBuilder sb = new StringBuilder();
         
        int n = s.length();
        for(int i = 0; i < numRows; i++){
            int j = i;
            if(i == 0 || i == numRows-1){
                while(j < n){
                    sb.append(s.charAt(j));
                    j += (2*(numRows-2) + 1 + 1);
                }
            }else{
                boolean dir = false;//if true then up, else down
                while(j < n){
                    sb.append(s.charAt(j));
                    if(dir){
                        j += (2*(i-1) + 1 + 1);
                    }else{
                        j += (2*(numRows-i-2) + 1 + 1);
                    }
                    dir = !dir;
                }
            }
        }
        return sb.toString();
    }
}
