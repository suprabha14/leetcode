class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap();
        int preSum = 0, c = 0;
        mpp.put(0, 1);
        for(int i = 0; i < n; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            c += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0)+ 1);
        }
        return c;
    }
}