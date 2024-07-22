class Solution {
public:
    int fib(int n) {
        if(n<=1)
        return n;
        int l1=fib(n-1);
        int l2=fib(n-2);
        return l1+l2;
    }
};