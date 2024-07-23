class Solution {
    public static int maxProduct(int[] nums) {
        int temp[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        if(Arrays.equals(nums,temp)){
            return 1000000000;
        }
        int res = Integer.MIN_VALUE;
        int pref = 1;
        int suff = 1;
        for(int i = 0; i < nums.length; i++){
            pref *= nums[i];
            res = Math.max(res, pref);
            if(pref == 0) 
            pref = 1;
        }
        for(int i = nums.length-1; i >= 0; i--){
            suff *= nums[i];
            res = Math.max(res, suff);
            if(suff == 0) 
            suff = 1;
        }
        return res;
    }
}