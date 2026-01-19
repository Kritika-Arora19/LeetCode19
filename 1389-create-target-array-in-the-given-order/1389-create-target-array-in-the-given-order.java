class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> new_nums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int ind = index[i];
            int num = nums[i];
            new_nums.add(ind, num);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < new_nums.size(); i++){
            target[i] = new_nums.get(i);
        }
        return target;
    }
}