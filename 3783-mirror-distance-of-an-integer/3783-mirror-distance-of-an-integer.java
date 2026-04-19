class Solution {
    public int mirrorDistance(int n) {
        int s=0,num=n;
        while(n>0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        int ans=Math.abs(num-s);
        return ans;
    }
}