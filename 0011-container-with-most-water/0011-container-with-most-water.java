class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxCapacity=0;
        while(i<j){
            int capacity=((Math.min(height[i], height[j]))*(j-i));
            maxCapacity = Math.max(maxCapacity, capacity);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxCapacity;
    }
}