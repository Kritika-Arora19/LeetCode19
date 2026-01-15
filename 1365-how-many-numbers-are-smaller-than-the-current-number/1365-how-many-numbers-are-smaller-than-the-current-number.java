class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length,co=0,k=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                co=co+1;
            }
            ar[k]=co;
            co=0;
            k=k+1;
        }
        return ar;
    }
}