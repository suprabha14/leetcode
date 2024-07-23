class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c1 = 0, c2 = 0;
        int e1 = 0, e2 = 0;
        for(int i = 0; i < n; i++) {
            if(c1 == 0 && e2 != nums[i]) {
                c1 = 1;
                e1 = nums[i];
            }
            else if (c2 == 0 && e1 != nums[i]) {
                c2 = 1;
                e2 = nums[i];
            }
            else if (nums[i] == e1) {
                c1++;
            }
            else if (nums[i] == e2) {
                c2++;
            }
            else {
                c1--; 
                c2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        int mini = n / 3;
        c1 = 0; c2 = 0;
        for (int i = 0; i < n; i++) {
            if (e1 == nums[i]) {
                c1++;
            }
            else if (e2 == nums[i]) {
                c2++;
            }
        }
        if (c1 > mini) {
            res.add(e1);
        }
        if (c2 > mini) {
            res.add(e2);
        }
        return res;
    }
}