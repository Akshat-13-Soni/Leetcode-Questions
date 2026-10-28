class Solution {
    public int titleToNumber(String columnTitle) {
        // int n = columnTitle.length();
        // int result = 0;

        // for(int i = 0; i < n; i++){
        //     int ch = columnTitle[i] - 'A' + 1;
        //     result = result*26 + ch;
        // }
        // return result;
        int n = columnTitle.length();
        int result = 0;

        for(int i=0; i<n; i++){
            int ch = columnTitle.charAt(i) - 'A' + 1;
            result = result*26 + ch;
        }
        return result;

    }
}