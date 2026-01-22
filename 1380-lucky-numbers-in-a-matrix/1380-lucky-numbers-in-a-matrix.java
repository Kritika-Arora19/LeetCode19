class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int t=0,max=0;
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]>max){
                max=matrix[j][i];
                t=j;}
            }
            int min=max;
            for(int k=0;k<matrix[0].length;k++)
            {
                if(matrix[t][k]<min)
                min=matrix[t][k];
            }
            if(max==min)
            list.add(min);
            max=0;
        }
        return list;
    }
}