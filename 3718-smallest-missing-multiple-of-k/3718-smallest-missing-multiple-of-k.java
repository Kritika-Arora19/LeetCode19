class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums)
        {
            list.add(x);
        }
        int m=k,i=1;
        for(int j=0;j<nums.length;j++)
        {
            if(list.contains(m))
            {
            m=k*(++i);
            }
            else
            return m;
        }
        return k*i;
    }
}