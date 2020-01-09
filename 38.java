class Solution {
    public String countAndSay(int n) {
        String ret = "1";
        n--;
        while(n > 0){
            String now = "";
            char last = ret.charAt(0);
            int count = 1;
            for(int i = 1, len = ret.length(); i < len; i++){
                if(ret.charAt(i) == last){
                    count++;
                }else{
                    now += String.valueOf(count);
                    now += last;
                    count = 1;
                    last = ret.charAt(i);
                }
            }
            now += String.valueOf(count);
            now += last;
            ret = now;
            n--;
        }
        return ret;
    }
}
