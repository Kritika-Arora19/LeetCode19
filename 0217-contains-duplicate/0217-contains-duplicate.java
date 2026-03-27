class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> seenNumbers = new HashSet<>(nums.length * 2);
        for (int num : nums) {        
            if (!seenNumbers.add(num)){  
                return true;  
            }          
        }
        return false;
    }
}