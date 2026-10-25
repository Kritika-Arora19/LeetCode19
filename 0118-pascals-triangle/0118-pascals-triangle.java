class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0)
        return res;
        List<Integer> fr=new ArrayList<>();
        fr.add(1);
        res.add(fr);

        if(numRows==1)
        return res;

        for(int i=1;i<numRows;i++){
            List<Integer> pr=res.get(i-1);

            ArrayList<Integer> r=new ArrayList<>();
            r.add(1);
            for(int j=0;j<i-1;j++){
                r.add(pr.get(j)+pr.get(j+1));
            }
            r.add(1);
            res.add(r);
        }
        return res;
    }
}