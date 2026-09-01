class Solution {
    public String reverseWords(String s) {
        String[] strSplit = s.trim().split("\s+");
        StringBuilder res = new StringBuilder();
        for(int  i = strSplit.length - 1; i >= 0; i-- ){
            res.append(strSplit[i]);
            if(i != 0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}