class Solution {
    public int passThePillow(int n, int time) {
        int direction = 1;
        int index=1;
        for(int i=0; i<time; i++){
            if(index==n){
                direction=-1;
            }
            if(index==1){
                direction=1;
            }
            index+=direction;
        }
        return index;
    }
}