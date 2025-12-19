class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int[] ar=new int[2];
        while(i<nums.length)
        {
            int c=nums[i]-1;
            if(nums[i]!=nums[c])
            {
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ar[0]=nums[j];
                ar[1]=j+1;
            }
        }
        return ar;
    }
    static void swap(int[] nums,int f,int s)
    {
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}