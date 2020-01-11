class Solution {
    public int totalFruit(int[] tree) {
        int ret = -1;
        int n = tree.length;
        
        //編集
        List<Pair> trimmedTree = new ArrayList<>();
        int last = tree[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(last == tree[i]) count++;
            else{
                trimmedTree.add(new Pair(last, count));
                last = tree[i];
                count = 1;
            }
        }
        trimmedTree.add(new Pair(last, count));
                  
        //尺取り法
        int right = -1, left = 0;
        count = 0;
        n = trimmedTree.size();
        Set<Integer> st = new HashSet<>();
        while(true){
            if(st.size() < 2 || st.contains(trimmedTree.get(right+1).first)){
                right++;
                count += trimmedTree.get(right).second;
                st.add(trimmedTree.get(right).first);
            }else{
                ret = Math.max(ret, count);
                left = right;
                count = trimmedTree.get(right).second;
                st.clear();
                st.add(trimmedTree.get(right).first);
            }
            
            if(right == n-1){
                ret = Math.max(ret, count);
                break;
            }
        }
        return ret;
    }
}

class Pair{
    public int first;
    public int second;

    public Pair(int a, int b){
        first = a;
        second = b;
    }
}
