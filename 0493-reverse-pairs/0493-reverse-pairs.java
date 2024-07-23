class Solution {  
    int mergeSort(int[] nums, int low, int high) {
        if(low >= high) {
            return 0;
        }
        int mid = (low+high) / 2;
        int cnt = mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid+1, high);
        cnt += merge(nums, low, mid, high);
        return cnt;
    } 
    public static int merge(int[] nums, int low, int mid, int high) {
        int c = 0;
        int j = mid + 1;
        for(int i = low; i <= mid; i++) {
            while(j <= high && nums[i] > (2* (long) nums[j])) {
                j++;
            }
            c += j-(mid + 1);
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        int left = low, right = mid + 1;
        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                tmp.add(nums[left++]);
            }
            else {
                tmp.add(nums[right++]);
            }
        }
        while(left <= mid)
        tmp.add(nums[left++]);
        while(right <= high) 
        tmp.add(nums[right++]);
        for(int i = low; i <= high; i++) {
            nums[i] = tmp.get(i - low);
        }
        return c;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}