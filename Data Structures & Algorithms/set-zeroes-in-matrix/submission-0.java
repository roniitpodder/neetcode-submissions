class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean[] rc=new boolean[r];
        boolean[] cc=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rc[i]=true;
                    cc[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rc[i]||cc[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}