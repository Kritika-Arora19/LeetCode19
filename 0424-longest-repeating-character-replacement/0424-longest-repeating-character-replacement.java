class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxl=0,maxf=0;
        int h[]=new int[26];
        while(r<s.length()){
            h[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,h[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k){
                h[s.charAt(l)-'A']--;
                maxf=0;
                for(int i=0;i<26;i++){
                    maxf=Math.max(maxf,h[i]);
                }
                l=l+1;
            }
            if((r-l+1)-maxf<=k)
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}