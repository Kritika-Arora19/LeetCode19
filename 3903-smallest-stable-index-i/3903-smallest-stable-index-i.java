class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            int ma=max(0,i,nums);
            int mi=min(i,nums.length-1,nums);
            if(ma-mi<=k)
            return i;
        }
        return -1;
    }
        int max(int s,int e,int[] n)
        {
            int m1=n[s];
            for(int i=s;i<=e;i++)
            {
                if(n[i]>=m1)
                m1=n[i];
            }
            return m1;
        }
        int min(int s,int e,int[] n)
        {
            int m2=n[s];
            for(int i=s;i<=e;i++)
            {
                if(n[i]<=m2)
                m2=n[i];
            }
            return m2;
        }
}