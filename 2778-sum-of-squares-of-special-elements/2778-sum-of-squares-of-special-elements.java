class Solution {
    public int sumOfSquares(int[] nums) {
        ArrayList<Integer> special = new ArrayList<>();
        int n = nums.length;
        int sumSquare=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                special.add(nums[i-1]);
            }
        }
        for(int i=0; i<special.size(); i++){
            sumSquare+=(special.get(i)*special.get(i));
        }
        return sumSquare;
    }
}