class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length,co=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                co++;
            }
            ar[i]=co;
            co=0;
        }
        return ar;
    }
}