class Solution {
    int x;
    public boolean isPalindrome(int x) {
        int n=x,d=0,s=0;
        for (n=x;x>0;x/=10)
        {
            d=x%10;
            s=(s*10)+d;
        }
        if (s==n)
            return true;
        else 
            return false;
    }
    public void print()
    {
        boolean p=isPalindrome(x);
        System.out.println (p);
    }
}