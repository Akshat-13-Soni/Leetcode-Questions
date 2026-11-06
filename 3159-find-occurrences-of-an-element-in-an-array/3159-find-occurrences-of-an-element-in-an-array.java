class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        int m = queries.length;
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]==x){
                pos.add(i);
            }
        }
        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            int k = queries[i];
            if(k<=pos.size()){
                ans[i]=pos.get(k-1);
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }
}