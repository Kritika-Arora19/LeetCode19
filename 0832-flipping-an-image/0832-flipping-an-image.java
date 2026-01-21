class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp=0,r=image.length;
        int r1=r-1;
        int n=r/2;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp=image[i][j];
                image[i][j]=image[i][r1];
                image[i][r1]=temp;
                r1=r1-1;
            }
            r1=r-1;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(image[i][j]==0)
                image[i][j]=1;
                else
                image[i][j]=0;
            }
        }
        return image;  
    }
}