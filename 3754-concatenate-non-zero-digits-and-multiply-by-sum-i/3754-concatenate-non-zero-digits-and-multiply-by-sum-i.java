class Solution {
    public long sumAndMultiply(int n) {
        long p=1,sum=0,x=0;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            if(r!=0)
            {
                x=x+(r*p);
                p=p*10;;
            }
            n=n/10;
        }
        return sum*x;
    }
}