class Solution {
    public boolean isPowerOfFour(int n) {
        int j=0;
        for(int k=0;k<=30;k++)
        {
            if(n==Math.pow(4,k))
            {
                j=1;
            }
        }
        if(j==1)
        return true;
        else
        return false;
    }
}