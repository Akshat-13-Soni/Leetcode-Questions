class Solution {
    public int reverseDegree(String s) {
        int sum=0, n=s.length();
        for(int i=0; i<n; i++){
            char c =s.charAt(i);
            int reversedValue = 26-(c-'a');
            int position =i+1;
            sum+=reversedValue*position;
        }
        return sum;
    }
}