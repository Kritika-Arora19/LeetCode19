class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ar= new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
           ar[indices[i]]=s.charAt(i); 
        }
        String s1= new String(ar);
        return s1;
    }
}