class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []leftSum = new int[n];
        int []rightSum = new int[n];
        int []ans= new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                s=s+nums[j];
            }
            leftSum[i]=s;
            s=0;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                s=s+nums[j];
            }
            rightSum[i]=s;
            s=0;
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}