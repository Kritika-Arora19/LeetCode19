class Solution {
    public boolean checkIfPangram(String sentence) {
      int k=0,s=0;
      int[] ar=new int[26];
      for(int i=0;i<sentence.length();i++)
      {
        int as=sentence.charAt(i);
        int as1=as-97;
        ar[as1]=k+1;
        k=0;
      }
      for(int j=0;j<26;j++)
      {
        if(ar[j]>=1)
        s++;
      }
      if(s==26)
      return true;
      else
      return false;
    }
}