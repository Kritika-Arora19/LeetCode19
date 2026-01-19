class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        String s="";
        int di=0,small=0; 
        int l1=word1.length();
        int l2=word2.length();
        if(l2>l1)
        {
            di=l2-l1;
            small=l1;
            s=word2.substring(l1,l2);
        }
          if(l1>l2)
        {
          di=l1-l2;
          small=l2;
          s=word1.substring(l2,l1);
        }
        else
        {
            small=l1;
        }
        for(int i=0;i<small;i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(l1!=l2)
        sb.append(s);
        return sb.toString();
    }
}