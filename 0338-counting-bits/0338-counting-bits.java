class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int no=i;
            int c=0;
            while(no>0)
            {
                no=no &(no-1);
                c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}