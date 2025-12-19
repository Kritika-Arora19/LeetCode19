class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
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
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1){
            ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int f, int s)
    {
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}