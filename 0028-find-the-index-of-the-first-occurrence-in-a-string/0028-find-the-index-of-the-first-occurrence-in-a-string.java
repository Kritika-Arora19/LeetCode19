class Solution {
    public int strStr(String haystack, String needle) {
              for(int i = 0; i <= haystack.length() - needle.length(); i++){
            String current = haystack.substring(i,needle.length()+i);
            if(current.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}