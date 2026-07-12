class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==target)
            list.add(i);
        }
        return list;
    }
}