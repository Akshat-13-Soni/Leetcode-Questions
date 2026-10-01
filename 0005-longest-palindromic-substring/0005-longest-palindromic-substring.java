class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int l = i, r = j;
                while (l < r && s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                }
                // pointers crossed means every pair matched
                if (l >= r && j - i + 1 > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}