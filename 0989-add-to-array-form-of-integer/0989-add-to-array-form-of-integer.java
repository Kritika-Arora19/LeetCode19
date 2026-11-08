class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;
        
        // Loop as long as there are digits in num OR there is a remaining value/carry in k
        while (i >= 0 || k > 0) {
            // Add the current digit of num to k if we haven't exhausted the array
            if (i >= 0) {
                k += num[i];
                i--;
            }
            
            // The last digit of k is the value for the current position
            result.addFirst(k % 10);
            
            // Reduce k to carry over the remaining value to the next column
            k /= 10;
        }
        
        return result;
    }
}