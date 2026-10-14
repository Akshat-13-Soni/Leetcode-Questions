class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char ch1:s.toCharArray()){
            ans^=ch1;
        }
        for(char ch2 : t.toCharArray()){
            ans^=ch2;
        }
        return ans;
    }
}