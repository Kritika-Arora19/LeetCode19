class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split(" ");
        int n=arr.length;
      StringBuilder sb=new StringBuilder();  
        for(int i=0;i<n;i++){
            StringBuilder temp=new StringBuilder(arr[i]);
        sb.append(temp.reverse());
        sb.append(" ");
        }
         return sb.toString().trim();
    }
}