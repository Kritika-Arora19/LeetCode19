class Solution {
    public boolean isHappy(int n) {
        int sum=0,num=0;
        while(sum!=1)
        {
            sum=0;
            num=n;
            while(n!=0)
            {
                int r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            n=sum;
            if(sum==1)
            return true;
            if(sum==4)
            return false;
        }
        return false;
    }
}