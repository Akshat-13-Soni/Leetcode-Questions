class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. skip leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. read optional sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. read digits, clamping on overflow
        int result = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // would result * 10 + digit exceed Integer.MAX_VALUE?
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}