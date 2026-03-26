class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);}
        }
        int []a=new int[list.size()];
        for(int k=0;k<list.size();k++)
        {
            a[k]=list.get(k);
        }
        return a;
    }
}