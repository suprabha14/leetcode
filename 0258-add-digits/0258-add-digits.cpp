class Solution {
public:
    int addDigits(int num) {
        while(num>9) {
            int d=0,s=0;
            for( ;num>0;num=num/10) {
                d=num%10;
                s=s+d;
            }  
            num=s;             
        }
        return num; 
    }
};