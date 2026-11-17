class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        //skipping leading whitespace
        while (i < n && s.charAt(i) == ' '){
            i++;
        }
        //'-' '+' optional sign
        int sign = 1;                                                  //positive by default
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {       
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        //reading the digits and checking overflow
        int result = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';                                 //'7'-'0'=7 
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}