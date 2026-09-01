class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        String []w =s.split(" ");
        int st=0,e=w.length-1;
        while(st<e)
        {
            String temp=w[st];
            w[st]=w[e];
            w[e]=temp;
            st++;
            e--;
        }
        String ns = String.join(" ",w);
        return ns;
    }
}