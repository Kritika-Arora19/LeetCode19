class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums2) {
          list1.add(num);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(list1.contains(nums1[i]) && !list.contains(nums1[i]))
            list.add(nums1[i]);
        }
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        } 
        return ans;
}
}