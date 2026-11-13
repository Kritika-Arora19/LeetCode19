class Solution {
    public int minBitFlips(int start, int goal) {
        int ans= start^goal;
        //after that simply counting the number of set  bits
        int n=ans;
        int cnt=0;
        while(n>0){
           cnt+=n&1;
           n=n>>1;
        }
        return cnt;
    }
}