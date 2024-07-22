class Solution {
public:
    bool isHappy(int n) {
        while(n>9) {
            int d=0,s=0;
            for( ;n>0;n/=10) {
                d=n%10;
                s=s+(d*d);           
            }
            n=s;
        }
        if(n==1 or n==7)
        return true;
        else
        return false;
    }
};