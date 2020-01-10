class Solution {
    public int myAtoi(String str) {
        str = deleteWhitespace(str);
        str = getStringNum(str);
        return getNum(str);
    }
    
    private String deleteWhitespace(String str){
        int i = 0;
        for(; i < str.length(); i++){
            if(str.charAt(i) != ' ') break;
        }
        return str.substring(i);
    }
    
    private String getStringNum(String str){
        String ret = "";
        int i = 0;
        if(str.length() == 0) return ret;
        if(str.charAt(0) == '-'){
            ret += '-';
            i++;
        }else if(str.charAt(0) == '+'){
            i++;
        }
        for(int n = str.length(); i < n; i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)) ret += c;
            else break;
        }
        if(ret.equals("-")) ret = "";
        return ret;
    }
    
    private int getNum(String str){
        if(str == "") return 0;
        int ret = 0;
        try{
            ret = Integer.parseInt(str);
        }catch(Exception e){
            if(str.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        return ret;
    }
}
