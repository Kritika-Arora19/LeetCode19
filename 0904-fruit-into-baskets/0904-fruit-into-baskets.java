class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> bas=new HashMap<>();
        int l=0,r=0,max=0;
        for(r=0;r<fruits.length;r++){
            int cc=bas.getOrDefault(fruits[r],0);
            bas.put(fruits[r],cc+1);

            while(bas.size()>2){
                int fc=bas.get(fruits[l]);
                if(fc==1)
                bas.remove(fruits[l]);
                else
                bas.put(fruits[l],fc-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}