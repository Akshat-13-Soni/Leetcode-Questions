class Solution {
    public int findClosest(int x, int y, int z) {
        int dist13 = Math.abs(z-x);
        int dist23 = Math.abs(z-y);
        if(dist13<dist23){
            return 1;
        }
        else if(dist23<dist13){
            return 2;
        }
        else{
            return 0;
        }
    }
}