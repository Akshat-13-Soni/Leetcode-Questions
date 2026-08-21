class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int right = n-1, bottom = m-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(top<=bottom && left<=right){
            // right
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //bottom
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                //left
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                //top
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}