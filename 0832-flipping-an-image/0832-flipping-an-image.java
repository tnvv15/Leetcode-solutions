class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows=image.length;
        int cols=image[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols/2;j++){
                int ans=image[i][cols-j-1];
                image[i][cols-j-1]=image[i][j];
                image[i][j]=ans;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(image[i][j]==1){image[i][j]=0;}
                else{image[i][j]=1;}
            }
        }
        return image;
    }
}