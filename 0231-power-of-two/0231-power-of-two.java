class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        for(int i=0;i<=30;i++)
        {
            if(n==Math.pow(2,i))
            {
               c=1;
            }
        }
        if(c==1)
        return true;
        else
        return false;
    }
}