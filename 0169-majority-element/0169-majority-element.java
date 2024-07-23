class Solution {
    public int majorityElement(int[] nums) {
        int c=0, ele=0;
        for(int i=0;i<nums.length;i++) {
            if(c==0) {
                c=1;
                ele=nums[i];
            }
            else if(nums[i]==ele) {
                c++;
            }
            else {
                c--;
            }
        }
        int c1=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==ele)
            c1++;
        }
        if(c1>(nums.length/2))
        return ele;
        else
        return -1;
    }
}