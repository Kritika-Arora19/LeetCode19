class Solution {
    public boolean isPowerOfThree(int n) {
        int j=0;
        for(int k=0;k<=30;k++)
        {
            if(n==Math.pow(3,k))
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