class Solution {
public:
    bool check(vector<int>& nums) {    
        int l=nums.size();
        int c=0;
        for(int i=1;i<l;i++) {
            if(nums[i-1]>nums[i]) {
                c++;
            }
        }
        if(nums[l-1]>nums[0]) {
            c++;
        }
        return c<=1;
    }
};