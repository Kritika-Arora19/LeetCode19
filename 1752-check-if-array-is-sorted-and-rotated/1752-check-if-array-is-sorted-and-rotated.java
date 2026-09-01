class Solution {
    public boolean check(int[] nums) {
        int c=0;
        if(nums[0]<nums[nums.length-1])
        c++;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            c++;
        }
        if(c>1)
        return false;
        else 
        return true;
    }
}