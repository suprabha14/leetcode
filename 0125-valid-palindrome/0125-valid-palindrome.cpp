class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0, f = 0;
        string p;
        int l = s.size();
        for (i = 0; i < l; i++) {
            if (isalnum(s[i]))
                p += s[i];
        }
        int l1 = p.size();
        for (i = 0; i < l1 / 2; i++) {
            if (tolower(p[i]) == tolower(p[l1 - i - 1]))
                continue;
            else {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return false;
        else
            return true;
               
    
    }
};