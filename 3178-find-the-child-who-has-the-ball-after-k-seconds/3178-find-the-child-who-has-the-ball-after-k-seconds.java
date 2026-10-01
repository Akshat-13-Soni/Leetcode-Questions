class Solution {
    public int numberOfChild(int n, int k) {
        int ballDirection=1;
        int index=0;
        for(int i=0; i<k; i++){
            if(index==n-1){
                ballDirection=-1;
            }
            if(index==0){
                ballDirection=1;
            }
            index+=ballDirection;
        }
        return index;
    }
}