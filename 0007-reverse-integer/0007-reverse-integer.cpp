class Solution {
public:
    int reverse(int x) {
        int d=0;
        long s=0;
        while(x) {
            d=x%10;
            s=(s*10)+d;
            x/=10;
        }
        if(s>INT_MIN and s<INT_MAX)
        return s;
        else
        return 0;
    }
};