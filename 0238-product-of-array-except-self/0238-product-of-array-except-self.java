class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=1;
        int s=1;
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            s=s*nums[j+1];
            ans[j]=ans[j]*s;
        }
        return ans;
    }
}