class Solution {
    public int findNumbers(int[] nums) {
        int k=0,even=0,s;
        for(int i=0;i<nums.length;i++)
        {
            s=0;
            k=nums[i];
            while(k!=0)
            {
                k=k/10;
                s=s+1;
            }
            if(s%2==0)
            even=even+1;
        }
        return even;
    }
}