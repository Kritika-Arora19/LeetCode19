class Solution {
    public boolean isPalindrome(int x) {
        int n =0,r;
        int num=x;
        while(x>0)
        {
             r=x%10;
             x=x/10;
             n= n*10+r;
        }
        if(num==n)
        return true;
        else
        return false;
    }
}