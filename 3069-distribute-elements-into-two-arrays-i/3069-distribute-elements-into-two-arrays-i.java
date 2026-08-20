class Solution {
    public int[] resultArray(int[] nums) {
      int n=nums.length;
      List<Integer> l1=new ArrayList<>();
      List<Integer> l2=new ArrayList<>();
      l1.add(nums[0]);
      l2.add(nums[1]);
      for(int k=2;k<n;k++)
      {
        if(l1.get(l1.size()-1)>l2.get(l2.size()-1))
        l1.add(nums[k]);
        else
        l2.add(nums[k]);
      }
      l1.addAll(l2);
      int[] result = new int[l1.size()];
      for (int i = 0; i < l1.size(); i++) 
      {
       result[i] = l1.get(i);
      }
      return result;
    }
}