class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=0;i<rowIndex-1;i++){
            ans=ans*(rowIndex-i);
            ans=ans/(i+1);
            list.add((int)ans);
        }
        if(rowIndex!=0)
        list.add(1);
        return list;
    }
}