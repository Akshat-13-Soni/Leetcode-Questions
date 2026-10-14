class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int rem = Math.min(9, sum);
            sb.append(rem);
            sum -= rem;
        }
        return sb.toString();
    }
}