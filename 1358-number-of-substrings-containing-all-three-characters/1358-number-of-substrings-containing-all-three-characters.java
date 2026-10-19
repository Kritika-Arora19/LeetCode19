class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int ls[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            ls[s.charAt(i)-'a']=i;
            if(ls[0]!=-1 && ls[1]!=-1 && ls[2]!=-1)
            c=c+(1+Math.min(Math.min(ls[0],ls[1]),ls[2]));
        }
        return c;
    }
}