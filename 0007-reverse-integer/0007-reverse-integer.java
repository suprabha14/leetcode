class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int d = x % 10;
            int s = res * 10 + d;
            if((s - d) / 10 != res)
            return 0;
            res = s;
            x /= 10;
        }
        return res;
    }
}