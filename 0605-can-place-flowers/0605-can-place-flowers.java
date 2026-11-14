class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){                           //plot is empty
                int left=(i==0)?0:flowerbed[i-1];          //look for left neigbour
                int right=(i==len-1)?0:flowerbed[i+1];     //look for right neighbour
                if(left==0 && right==0){                   //if both empty
                    flowerbed[i]=1;                        //set that plot as 1, filled
                    n--;
                }
            }
        }
        return n<=0;                                        //true if all flowers potted succesfully
    }
}