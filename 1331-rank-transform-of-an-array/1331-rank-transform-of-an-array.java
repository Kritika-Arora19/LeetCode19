class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums=new int[arr.length];
        int[] ans=new int[arr.length];
        int s=1;
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],s);
                s++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
        }
    }