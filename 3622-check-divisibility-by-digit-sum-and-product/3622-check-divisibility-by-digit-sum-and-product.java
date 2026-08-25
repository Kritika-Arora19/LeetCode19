class Solution {
    public boolean checkDivisibility(int n) {
        int dp=1,ds=0,num=n;
        while(num!=0)
        {
            int r=num%10;
            ds=ds+r;
            dp=dp*r;
            num=num/10;
        }
        int sum=ds+dp;
        if(n%sum==0)
        return true;
        else
        return false;
    }
}