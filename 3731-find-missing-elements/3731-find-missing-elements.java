class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
            if(nums[i]<min)
            min=nums[i];
            if(nums[i]>max)
            max=nums[i];
        }
        List<Integer> l= new ArrayList<>();
        for(int i=min;i<max;i++)
        {
            boolean h=list.contains(i);
            if(h==false)
            l.add(i);
        }
        return l;
    }
}