class Solution {
    public int[] separateDigits(int[] nums) {

        StringBuilder sb = new StringBuilder();
        
        for(int num : nums){
            sb.append(String.valueOf(num));
        }

        int n = sb.length();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sb.charAt(i) - '0';
        }

        return arr;
    }
}