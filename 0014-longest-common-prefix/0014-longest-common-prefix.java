class Solution {
    public String longestCommonPrefix(String[] strs) { int c=0;
        for(int j=0;j<strs.length;j++)
        {
        if(strs[j].length()==0)
        c++;
        }
        if(c==0)
        {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        char[] first= strs[0].toCharArray();
        char[] last= strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]==last[i])
            sb.append(first[i]);
            else
            break;
        }
        String s=sb.toString();
        return s;
    }
    else
    return "";
}
}