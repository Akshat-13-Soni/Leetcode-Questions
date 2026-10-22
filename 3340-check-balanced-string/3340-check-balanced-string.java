class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int sumI=0;
        int sumJ=0;
        for(int i=0; i<n; i=i+2){
            sumI += num.charAt(i)-'0';
        }
        for(int j=1; j<n; j=j+2){
            sumJ+=num.charAt(j)-'0';
        }
        return sumI == sumJ;
    }
}