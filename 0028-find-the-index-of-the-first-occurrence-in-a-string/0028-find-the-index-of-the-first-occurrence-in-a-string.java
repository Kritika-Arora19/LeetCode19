class Solution {
    public int strStr(String haystack, String needle) {
         int id=haystack.indexOf(needle);
         if(id!=-1)
         return id;
         else
         return -1;
    }
}