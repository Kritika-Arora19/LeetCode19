class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ns="zyxwvutsrqponmlkjihgfedcba";
        StringBuilder sb=new StringBuilder();
        for(String s:words)
        {
            int sum=0;
            for(char c:s.toCharArray())
            {
                int n=c-'a';
                sum+=weights[n];
            }
            int res=sum%26;
            sb.append(ns.charAt(res));
        }
        return sb.toString();
    }
}