class Solution {
    public int longestConsecutive(int[] nums) {
       int ll=0;
       Map<Integer, Boolean> eMap= new HashMap<>();
       for(int num: nums){
        eMap.put(num,Boolean.FALSE);
       } 
       for(int num : nums){
        int cl=1;
        int nextNum=num+1;
        while(eMap.containsKey(nextNum) && eMap.get(nextNum)==false){
            cl++;
            eMap.put(nextNum,Boolean.TRUE);
            nextNum++;
        }

        int prevNum=num-1;
        while(eMap.containsKey(prevNum) && !eMap.get(prevNum)){
            cl++;
            eMap.put(prevNum,Boolean.TRUE);
            prevNum--;
        }
        ll=Math.max(ll,cl);
       }
       return ll;
    }
}