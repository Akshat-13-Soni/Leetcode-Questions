class Solution {
    public int countCommas(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int digitCount = String.valueOf(i).length();  // how many digits does i have?
            int commas = (digitCount - 1) / 3;             // how many commas does i get?
            total += commas;                                // add it to the running total
        }

        return total;
    }
}