class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<n+1;i++)
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