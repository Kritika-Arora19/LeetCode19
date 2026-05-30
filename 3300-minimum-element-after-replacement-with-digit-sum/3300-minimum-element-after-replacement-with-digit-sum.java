class Solution {
    public int minElement(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            while(n!=0)
            {
                int r=n%10;
                s=s+r;
                n=n/10;
            }
            nums[i]=s;
            s=0;
        }
         int min = nums[0];
        for (int i=1;i <nums.length;i++) {
            if (nums[i]<min)
                min=nums[i];
        }
        return min;
    }
}