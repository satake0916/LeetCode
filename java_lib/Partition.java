package java_lib;

class Partition{
    //numsのleftからrightまでをソートする
    //pivotより小さな値をpivotより左に、大きな値を右に配置する
    public int patition(int[] nums, int left, int right, int pivot_index){
        swap(nums, pivot_index, right);
        int store_index = left;

        for(int i = left; i < right; i++){
            if(nums[i] < nums[pivot_index]){
                swap(nums, store_index, i);
                store_index++;
            }
        }

        swap(nums, store_index, right);
        return store_index;
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}