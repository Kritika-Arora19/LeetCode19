class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        long s=0,e=num/2;
        while(s<=e)
        {
            long m=s+(e-s)/2;
            if(m*m==num)
            return true;
            else if(m*m>num)
            e=m-1;
            else
            s=m+1;
        }
        return false;
    }
}