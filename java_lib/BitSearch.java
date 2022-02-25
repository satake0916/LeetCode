package java_lib;

class BitSearch{
    public void bit_search(int[] nums, int key){
        int n = nums.length;
        for(int bit = 0; bit < (1 << n); bit++){
            for(int i = 0; i < n; i++){
                if((1 & (bit >> i)) == 1){
                    //なにかしらの処理
                }
            }
        }
    }
}