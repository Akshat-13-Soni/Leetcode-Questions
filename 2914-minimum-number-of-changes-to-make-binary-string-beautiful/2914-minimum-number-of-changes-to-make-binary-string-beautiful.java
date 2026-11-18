class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int changes=0;
        for(int i=0; i<n; i+=2){                     //i+=2 since we are checking in pairs not single single
            if(s.charAt(i)!=s.charAt(i+1)){
                changes++;
            }
        }
        return changes;
    }
}