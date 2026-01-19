class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int i=word.indexOf(ch);
        String s=word.substring(0,i+1);
        sb.append(new StringBuilder(s).reverse());
        sb.append(word.substring(i+1,word.length()));
        return sb.toString();
        
    }
}