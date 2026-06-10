class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int []pre = new int[n];
        int []suf = new int[n];
        pre[0]=0;
        suf[n-1]=0;
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int j=n-2;j>=0;j--)
        {
            suf[j]=suf[j+1]+nums[j+1];
        }
        for(int i=0;i<n;i++)
        {
            if(pre[i]==suf[i])
            return i;
        }
        return -1;
    }
}