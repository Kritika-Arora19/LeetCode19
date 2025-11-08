import java.io.*;
import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String w;
        int l=0,q=0;
        StringTokenizer st= new StringTokenizer(s);
        int t=st.countTokens();
        for(int p=1;p<=t;p++)
        {
            w=st.nextToken();
            q=q+1;
            if(q==t)
            l=w.length();
        }
        return l;
    }
}