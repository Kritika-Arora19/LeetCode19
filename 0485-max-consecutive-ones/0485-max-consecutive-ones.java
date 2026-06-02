class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1){
            m++;}
            else
            {
            max=Math.max(max,m);
            m=0;
            }
        }
        return Math.max(max,m);
    }
}