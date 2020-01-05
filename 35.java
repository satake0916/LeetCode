class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1, mid = 0;
	    while (i <= j) {
		    mid = (i + j) / 2;
		    if (nums[mid] == target) return mid;
		    if (nums[mid] > target) j = mid - 1;
		    else i = mid + 1;
	    }
	    return target < nums[mid] ? mid : mid + 1;
    }
}
