class Solution {
    public String restoreString(String s, int[] indices) {
        int k=0;
        char c=' ';
        char[] ar= new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            k=indices[i];
            c=s.charAt(i);
            ar[k]=c;
        }
        String s1= new String(ar);
        return s1;
    }
}