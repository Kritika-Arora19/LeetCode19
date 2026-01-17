class Solution {
    public String reverseWords(String s) {
        String[] word= s.split(" ");
        for(int i=0;i<word.length;i++)
        {
        StringBuilder sb=new StringBuilder(word[i]);
        word[i]=" ";
        sb.reverse();
        String rs=sb.toString();
        word[i]=rs;
        }
         StringBuilder sb1=new StringBuilder();
         for(int i=0;i<word.length;i++)
           {
            sb1.append(word[i]);
            if(i<word.length-1)
            sb1.append(" ");
           }
        String s1=sb1.toString();
        return s1;
    }
}