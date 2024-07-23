class Solution {
    public int firstP(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int first = -1;
        while(low <= high) {
            int mid =(low + high) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target)
            low = mid + 1;
            else 
            high = mid - 1; 
        }
        return first;
    }
    public int lastP(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int last = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target)
            low = mid + 1;
            else 
            high = mid - 1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int first = firstP(nums, target);
        if(first == -1)
        return res;
        int last = lastP(nums, target);
        res[0] = first;
        res[1] = last;
        return res;
    }
}