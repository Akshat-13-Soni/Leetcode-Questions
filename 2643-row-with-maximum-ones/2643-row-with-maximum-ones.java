class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = -1;
        int maxCount=-1;
        int n=mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++){
            int countOnes=0;
            for(int j=0; j<m; j++){
                countOnes+=mat[i][j];
            }
            if(countOnes>maxCount){
                maxCount=countOnes;
                index=i;
            }
        }
        return new int[]{index, maxCount};
    }
}