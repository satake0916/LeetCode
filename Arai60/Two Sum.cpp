class Solution {
public:
   vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> mp;
        int n = nums.size();
        for(int i = 0; i < n; i++){
            int rest = target - nums[i];
            if(mp.count(rest)){
                return {mp[rest], i};
                break;
            }else{
                mp.emplace(nums[i], i);
            }
        }
        return {};
    }
};
