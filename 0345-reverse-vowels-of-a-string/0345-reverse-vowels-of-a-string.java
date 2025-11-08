class Solution {
    public String reverseVowels(String s) {
        int l=s.length(),k;
        char c,c1,temp;
        String s1="",ss="";
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            s1=s1+c;
        }
        k=s1.length()-1;
         for(int j=0;j<l;j++)
        {
            c1=s.charAt(j);
            if(c1=='a' || c1=='e' || c1=='i' ||c1=='o' || c1=='u' || c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U')
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