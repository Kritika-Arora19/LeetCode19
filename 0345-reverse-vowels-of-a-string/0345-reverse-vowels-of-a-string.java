class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder();
        int l=s.length(),k;
        char c,c1,temp;
        String ss="";
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) 
            sb.append(c);
        }
        String s1=sb.toString();
        k=s1.length()-1;
         for(int j=0;j<l;j++)
        {
            c1=s.charAt(j);
             if ("aeiouAEIOU".indexOf(c1) != -1)
            {
                temp=c1;
                c1=s1.charAt(k);
                temp=' ';
                k--;
            }
            ss=ss+c1;
        }
        return ss;
    }
}