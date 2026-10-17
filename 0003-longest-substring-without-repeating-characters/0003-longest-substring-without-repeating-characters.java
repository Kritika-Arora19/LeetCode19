class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ar[]=new int[256];
        for(int i=0;i<256;i++){
            ar[i]=-1;
        }
        int n=s.length();
        int l=0,r=0,max=0;
        while(r<n){
            if(ar[s.charAt(r)]!=-1)
            {
                if(ar[s.charAt(r)]>=l)
                l=ar[s.charAt(r)]+1;
            }
            int len=r-l+1;
            max=Math.max(len,max);
            ar[s.charAt(r)]=r;
            r++;
        }
        return max;
    }
}