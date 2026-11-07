class Solution {
    private void backtrackRecurse(int[] nums, int start, List<Integer> path, List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));
        for(int i=start; i<nums.length; i++){
            path.add(nums[i]);
            backtrackRecurse(nums, i+1, path, ans);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrackRecurse(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}